package com.imooc.order.service;

import com.imooc.common.dto.UserContext;
import com.imooc.order.dto.OrderDetailRequestDTO;
import com.imooc.order.dto.OrderMasterRequestDTO;
import com.imooc.order.dto.OrderMasterResponseDTO;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * User: langzhifa
 * Date: 2019/5/18
 * Time: 18:43
 * Description:
 */
@FeignClient
@RequestMapping("/order-service")
public interface OrderMasterService {

    @GetMapping(value = "/getOrderMasterByUser")
    @ResponseBody
    List<OrderMasterResponseDTO> getOrderMasterByUser(@RequestParam UserContext userContext);

    @GetMapping(value = "/getOrderMaster")
    @ResponseBody
    OrderMasterResponseDTO getOrderMaster(@Param("orderId") String orderId);

    @PostMapping(value = "/creatorOrderMaster")
    @ResponseBody
    String createOrderMaster(@RequestParam List<OrderDetailRequestDTO>  detailList,@RequestParam UserContext userContext);
}
