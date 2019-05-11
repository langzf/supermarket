package com.imooc.product.entity;

import com.imooc.common.base.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * User: langzhifa
 * Date: 2019/4/28
 * Time: 0:51
 * Description:
 */
@Data
@Entity
public class ProductInfo extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -447306030841287370L;

    @Id
    private String productId;

    /**
     * 名字
     */
    private String productName;

    /**
     * 单价
     */
    private BigDecimal productPrice;

    /**
     * 状态  0 正常 1 下架
     */
    private Integer productStatus;

    /**
     * 库存
     */
    private Integer productStock;

    /**
     * 小图
     */
    private String productIcon;

    /**
     * 类目编号
     */
    private Integer categoryType;


    /**
     * 描述
     */
    private String productDescription;

}
