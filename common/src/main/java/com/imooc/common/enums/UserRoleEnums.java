package com.imooc.common.enums;

/**
 * @author: langzhifa
 * Date: 2019/6/5
 * Time: 23:22
 * Description:
 */
public enum UserRoleEnums {

    CUSTOMER(0,"customer"),
    MERCHANT(1,"merchant");

    private Integer value;

    private String desc;

    UserRoleEnums(Integer value,String desc){
        this.value=value;
        this.desc=desc;
    }

    public Integer getValue(){
        return  this.value;
    }

    public String getDesc(){
        return this.desc;
    }

    public UserRoleEnums getByValue(Integer value){
        for(UserRoleEnums roleEnums : UserRoleEnums.values()){
            if(roleEnums.value.equals(value)){
                return roleEnums;
            }
        }
        return null;
    }

}
