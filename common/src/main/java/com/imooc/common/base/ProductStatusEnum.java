package com.imooc.common.base;

/**
 * User: langzhifa
 * Date: 2019/5/9
 * Time: 23:29
 * Description:
 */
public enum  ProductStatusEnum {

    PUT_ON_SALE(0,"上架"),
    PUR_OFF_SALE(1,"下架");

    private Integer value;
    private String desc;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private ProductStatusEnum(Integer value,String desc){
        this.value=value;
        this.desc=desc;
    }
}
