package com.imooc.account.manager.account.manager;

import com.imooc.account.manager.account.converter.UserConverter;
import com.imooc.account.manager.account.entity.UserInfo;
import com.imooc.account.manager.account.repository.UserInfoRepository;
import com.imooc.account.manager.account.utils.UUidGenerator;
import com.imooc.common.dto.ResultDTO;
import com.imooc.supermarket.account.dto.UserInfoRequestDTO;
import com.imooc.supermarket.account.dto.UserInfoResponseDTO;
import com.imooc.supermarket.account.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: langzhifa
 * Date: 2019/5/19
 * Time: 18:12
 * Description:
 */
@Service
@Api(description = "用户管理")
public class UserServiceImpl implements UserService {

    @Autowired
    UserInfoRepository userInfoRepository;

    @Override
    @ApiOperation(value = "根据OpenId 查询用户信息",notes = "query user info by openId")
    public ResultDTO<UserInfoResponseDTO> queryUserByOpenId(String openId) {
        UserInfoResponseDTO userInfoResponseDTO = new UserInfoResponseDTO();
        UserInfo userInfo = userInfoRepository.queryByOpenId(openId);
        userInfoResponseDTO = UserConverter.userInfoToResponse(userInfo);

        return new ResultDTO<>(userInfoResponseDTO);
    }

    @Override
    @ApiOperation(value = "注册用户",notes = "registerUser")
    public ResultDTO<String> registerUser(UserInfoRequestDTO requestDTO) {
        UserInfo userInfo = UserConverter.responseDTOTOUserInfo(requestDTO);
        String userId = UUidGenerator.generateUserUUid();
        userInfo.setId(userId);
        userInfoRepository.save(userInfo);
        return new ResultDTO<>(userId);
    }
}
