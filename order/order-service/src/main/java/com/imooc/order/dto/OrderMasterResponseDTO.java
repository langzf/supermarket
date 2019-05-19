package com.imooc.order.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * User: langzhifa
 * Date: 2019/5/18
 * Time: 18:45
 * Description:
 */
@Data
public class OrderMasterResponseDTO implements Serializable {
    private static final long serialVersionUID = 5053165116689813418L;

    private String orderId;

    private BigDecimal orderAmount;

    private Integer orderStatus;

    private Integer payStatus;

    private List<OrderDetailResponseDTO> orderDetailResponseDTOList;

}
