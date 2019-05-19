package com.imooc.order.manager.converter;

import com.imooc.order.dto.OrderMasterResponseDTO;
import com.imooc.order.manager.entity.OrderMaster;

/**
 * @author: langzhifa
 * Date: 2019/5/18
 * Time: 22:40
 * Description:
 */
public class OrderMasterConverter {

    public static OrderMasterResponseDTO orderMasterToResponseDTO(OrderMaster orderMaster){
        OrderMasterResponseDTO orderMasterResponseDTO = new OrderMasterResponseDTO();
        orderMasterResponseDTO.setOrderAmount(orderMaster.getOrderAmount());
        orderMasterResponseDTO.setOrderId(orderMaster.getOrderId());
        orderMasterResponseDTO.setPayStatus(orderMaster.getPayStatus());
        orderMasterResponseDTO.setOrderStatus(orderMaster.getOrderStatus());
        return  orderMasterResponseDTO;
    }
}
