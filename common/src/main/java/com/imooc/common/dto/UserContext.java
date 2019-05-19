package com.imooc.common.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: langzhifa
 * Date: 2019/5/18
 * Time: 18:47
 * Description:
 */
@Data
public class UserContext implements Serializable {
    private static final long serialVersionUID = 8140952455704634159L;
    private String userId;

    private String userName;

    private String openId;

}
