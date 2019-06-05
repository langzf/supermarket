package com.imooc.common.error;


import com.imooc.common.exception.AccountException;

/**
 * @author: langzhifa
 * Date: 2019/6/5
 * Time: 23:40
 * Description:
 */
public class AccountErrorCode implements BaseErrorCode{

    public final static AccountException OPEN_ID_EXISTS =
            new AccountException(2001,"open id has register,please not register again","此openId已经绑定其他用户");


}
