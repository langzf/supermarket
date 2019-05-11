package com.imooc.product.dto.response;

import com.imooc.common.dto.response.BaseResponse;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ProductInfoResponseDTO extends BaseResponse {

    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productStatus;

    private Integer productStock;

    private String productIcon;

    private Integer categoryType;

    private String productDescription;
}
