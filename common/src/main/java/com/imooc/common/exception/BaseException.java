package com.imooc.common.exception;

import lombok.Data;

/**
 * @author: langzhifa
 * Date: 2019/6/5
 * Time: 23:59
 * Description:
 */
@Data
public class BaseException {

    private Integer code;

    private String message;

    private String localMessage;


}
