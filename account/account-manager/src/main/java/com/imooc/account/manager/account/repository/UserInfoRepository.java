package com.imooc.account.manager.account.repository;

import com.imooc.account.manager.account.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: langzhifa
 * Date: 2019/5/19
 * Time: 17:59
 * Description:
 */
public interface UserInfoRepository extends JpaRepository<UserInfo,String> {

    UserInfo queryByOpenId(String openId);
}
