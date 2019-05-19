package com.imooc.account.manager.account.utils;

import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author: langzhifa
 * Date: 2019/5/19
 * Time: 22:15
 * Description:
 */
@Component
public class UUidGenerator {

    public static String generateUserUUid(){
        return UUID.randomUUID().toString().replace("-","");
    }

}
