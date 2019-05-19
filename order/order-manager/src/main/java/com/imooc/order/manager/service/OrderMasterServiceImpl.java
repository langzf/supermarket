package com.imooc.order.manager.service;

import com.imooc.common.dto.UserContext;
import com.imooc.order.dto.OrderDetailRequestDTO;
import com.imooc.order.dto.OrderDetailResponseDTO;
import com.imooc.order.dto.OrderMasterRequestDTO;
import com.imooc.order.dto.OrderMasterResponseDTO;
import com.imooc.order.manager.converter.OrderDetailConverter;
import com.imooc.order.manager.converter.OrderMasterConverter;
import com.imooc.order.manager.entity.OrderDetail;
import com.imooc.order.manager.entity.OrderMaster;
import com.imooc.order.manager.repository.OrderDetailRepository;
import com.imooc.order.manager.repository.OrderMasterRepository;
import com.imooc.order.service.OrderMasterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @author: langzhifa
 * Date: 2019/5/18
 * Time: 20:53
 * Description:
 */
@Service
@Api(description = "订单详情")
public class OrderMasterServiceImpl implements OrderMasterService {

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Override
    @ApiOperation(value = "获取用户订单信息",notes = "get order master by user info")
    public List<OrderMasterResponseDTO> getOrderMasterByUser(UserContext userContext) {

        String openId = userContext.getOpenId();
        List<OrderMaster> orderMasterList = orderMasterRepository.queryByBuyerOpenid(openId);
        List<OrderMasterResponseDTO> orderMasterResponseDTOList =
                orderMasterList.stream().map(orderMaster -> {
                    String orderId = orderMaster.getOrderId();
                    List<OrderDetail> orderDetailList = orderDetailRepository.queryByOrderId(orderId);
                    List<OrderDetailResponseDTO> detailResponseDTOS = new ArrayList<>(orderDetailList.size());
                    orderDetailList.forEach(orderDetail -> {
                        OrderDetailResponseDTO orderDetailResponseDTO = OrderDetailConverter.orderDetailToDTO(orderDetail);
                        detailResponseDTOS.add(orderDetailResponseDTO);
                    });
                   OrderMasterResponseDTO responseDTO = OrderMasterConverter.orderMasterToResponseDTO(orderMaster);
                   responseDTO.setOrderDetailResponseDTOList(detailResponseDTOS);
                   return responseDTO;
                }).collect(toList());
        return orderMasterResponseDTOList;
    }

    @Override
    @ApiOperation(value = "获取订单详情",notes = "get order master info")
    public OrderMasterResponseDTO getOrderMaster(String orderId) {
        return null;
    }

    @Override
    @ApiOperation(value = "创建新的订单",notes = "create order master")
    public String createOrderMaster(@RequestParam List<OrderDetailRequestDTO>  detailList,@RequestParam UserContext userContext) {

        String openId  = userContext.getOpenId();


        return null;
    }
}
