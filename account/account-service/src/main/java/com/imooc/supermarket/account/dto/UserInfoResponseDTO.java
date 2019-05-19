package com.imooc.supermarket.account.dto;

import com.imooc.common.dto.response.BaseResponse;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: langzhifa
 * Date: 2019/5/19
 * Time: 17:18
 * Description:
 */
@Data
public class UserInfoResponseDTO extends BaseResponse implements Serializable {
    private static final long serialVersionUID = 3407604569499540916L;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 微信OpenID
     */
    private String openId;

    /**
     * 用户地址
     */
    private String address;

    /**
     * 用户手机号
     */
    private String phone;

    /**
     * 用户角色
     */
    private Integer role;

}
