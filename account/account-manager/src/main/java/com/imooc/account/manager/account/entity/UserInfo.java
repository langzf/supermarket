package com.imooc.account.manager.account.entity;

import com.imooc.common.base.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author: langzhifa
 * Date: 2019/5/19
 * Time: 17:55
 * Description:
 */
@Data
@Entity
public class UserInfo extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 355699439654107779L;

    @Id
    private String id;

    private String userName;

    private String password;

    private String openId;

    private String address;

    private String phone;

    private Integer role;

}
