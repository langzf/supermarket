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
 * Time: 21:10
 * Description:
 */
@Data
@Entity
public class OrderMaster extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -5316597871328165865L;

    @Id
    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    private String buyerOpenid;

    private BigDecimal orderAmount;

    private Integer orderStatus;

    private Integer payStatus;

}
