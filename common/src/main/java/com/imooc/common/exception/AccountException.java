package com.imooc.common.exception;

import lombok.Data;

/**
 * @author: langzhifa
 * Date: 2019/6/5
 * Time: 23:42
 * Description:
 */
@Data
public class AccountException extends BaseException{

    public AccountException(Integer errorCode, String message, String localMessage) {
        super.setCode(errorCode);
        super.setLocalMessage(localMessage);
        super.setMessage(message);
    }
}
