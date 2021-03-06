package com.imooc.product.manager;

import com.imooc.common.base.ProductStatusEnum;
import com.imooc.product.dto.response.ProductInfoResponseDTO;
import com.imooc.product.entity.ProductInfo;
import com.imooc.product.repository.ProductInfoRepository;
import com.imooc.product.service.ProductService;
import feign.Param;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * User: langzhifa
 * Date: 2019/4/28
 * Time: 0:50
 * Description:
 */
@Api(description = "商品详情")
@Service
public class ProductInfoServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    @ApiOperation(value = "根据Id获取商品",notes = "根据Id获取商品")
    public ProductInfoResponseDTO getProductInfoByProductId(@RequestParam String productId) {
        ProductInfoResponseDTO responseDTO = new ProductInfoResponseDTO();

        ProductInfo productInfo = productInfoRepository.findByProductId(productId);
        BeanUtils.copyProperties(productInfo,responseDTO);
        return responseDTO;
    }
}
