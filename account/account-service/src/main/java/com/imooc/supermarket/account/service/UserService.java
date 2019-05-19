package com.imooc.supermarket.account.service;

import com.imooc.common.dto.ResultDTO;
import com.imooc.supermarket.account.dto.UserInfoRequestDTO;
import com.imooc.supermarket.account.dto.UserInfoResponseDTO;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author: langzhifa
 * Date: 2019/5/19
 * Time: 17:15
 * Description:
 */
@FeignClient
@RequestMapping("/user")
public interface UserService {

    /**
     *
     * @param openId
     * @return
     */
    @GetMapping("/queryUser")
    ResultDTO<UserInfoResponseDTO> queryUserByOpenId(@RequestAttribute("openId") String openId);

    /**
     *
     * @param requestDTO
     * @return
     */
    @PostMapping("/registerUser")
    ResultDTO<String> registerUser(@RequestParam UserInfoRequestDTO requestDTO);

}
