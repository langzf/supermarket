package com.imooc.supermarket.account.dto;

import com.imooc.common.dto.response.BaseResponse;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: langzhifa
 * Date: 2019/5/19
 * Time: 17:27
 * Description:
 */
@Data
public class UserInfoRequestDTO extends BaseResponse implements Serializable {

    private static final long serialVersionUID = -2232991739963504489L;

    private String userName;

    private String password;

    private String address;

    private String phone;

    private Integer role;

    private String openId;

}
