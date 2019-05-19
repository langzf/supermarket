package com.imooc.order.manager.converter;

import com.imooc.order.dto.OrderDetailResponseDTO;
import com.imooc.order.manager.entity.OrderDetail;

/**
 * @author: langzhifa
 * Date: 2019/5/18
 * Time: 22:40
 * Description:
 */
public class OrderDetailConverter {

    public static OrderDetailResponseDTO orderDetailToDTO(OrderDetail orderDetail){
        OrderDetailResponseDTO responseDTO = new OrderDetailResponseDTO();
        responseDTO.setDetailId(orderDetail.getDetailId());
        responseDTO.setOrderId(orderDetail.getOrderId());
        responseDTO.setProductIcon(orderDetail.getProductIcon());
        responseDTO.setProductId(orderDetail.getProductId());
        responseDTO.setProductName(orderDetail.getProductName());
        responseDTO.setProductQuantity(orderDetail.getProductQuantity());
        return responseDTO;
    }

}
