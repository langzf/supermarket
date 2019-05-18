package com.imooc.product.service;

import com.imooc.product.dto.response.ProductInfoResponseDTO;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@FeignClient
@RequestMapping("/product-service")
public interface ProductService {

    @GetMapping("/getProductInfoByProductId")
    @ResponseBody
    ProductInfoResponseDTO getProductInfoByProductId(@RequestParam String productId);

    @GetMapping("/getProductCategory")
    @ResponseBody
    String getProductCategory();
}
