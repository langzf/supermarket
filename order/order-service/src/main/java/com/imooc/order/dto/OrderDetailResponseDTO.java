package com.imooc.order.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: langzhifa
 * Date: 2019/5/18
 * Time: 21:44
 * Description:
 */
@Data
public class OrderDetailResponseDTO implements Serializable {

    private static final long serialVersionUID = -5196125676612464122L;

    private String orderId;

    private String detailId;

    private String productName;

    private String productId;

    private Integer productQuantity;

    private String productIcon;

    @Override
    public String toString() {
        return "OrderDetailResponseDTO{" +
                "orderId='" + orderId + '\'' +
                ", detailId='" + detailId + '\'' +
                ", productName='" + productName + '\'' +
                ", productId='" + productId + '\'' +
                ", productQuantity=" + productQuantity +
                ", productIcon='" + productIcon + '\'' +
                '}';
    }
}
