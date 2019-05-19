package com.imooc.order.manager.entity;

import com.imooc.common.base.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author: langzhifa
 * Date: 2019/5/18
 * Time: 20:58
 * Description:
 */
@Data
@Entity
public class OrderDetail extends BaseEntity implements Serializable {
    private static final long serialVersionUID = -26692233056681201L;
    @Id
    private String detailId;

    private String orderId;

    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productQuantity;

    private String productIcon;

}
