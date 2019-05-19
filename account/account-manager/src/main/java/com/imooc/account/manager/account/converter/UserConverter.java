package com.imooc.account.manager.account.converter;

import com.imooc.account.manager.account.entity.UserInfo;
import com.imooc.supermarket.account.dto.UserInfoRequestDTO;
import com.imooc.supermarket.account.dto.UserInfoResponseDTO;

/**
 * @author: langzhifa
 * Date: 2019/5/19
 * Time: 18:24
 * Description:
 */
public class UserConverter {

    public static UserInfoResponseDTO userInfoToResponse(UserInfo userInfo){
        UserInfoResponseDTO userInfoResponseDTO = new UserInfoResponseDTO();
        userInfoResponseDTO.setUserName(userInfo.getUserName());
        userInfoResponseDTO.setAddress(userInfo.getAddress());
        userInfoResponseDTO.setOpenId(userInfo.getOpenId());
        userInfoResponseDTO.setPhone(userInfo.getPhone());
        userInfoResponseDTO.setRole(userInfo.getRole());
        return userInfoResponseDTO;
    }

    public static UserInfo responseDTOTOUserInfo(UserInfoRequestDTO requestDTO){
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName(requestDTO.getUserName());
        userInfo.setOpenId(requestDTO.getOpenId());
        userInfo.setAddress(requestDTO.getAddress());
        userInfo.setPhone(requestDTO.getPhone());
        userInfo.setPassword(requestDTO.getPassword());
        userInfo.setRole(requestDTO.getRole());
        return userInfo;
    }

}
