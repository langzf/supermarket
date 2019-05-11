package com.imooc.product.repository;

import com.imooc.product.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * User: langzhifa
 * Date: 2019/5/9
 * Time: 22:21
 * Description:
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {
    List<ProductInfo> findByProductStatus(Integer productStatus);
    List<ProductInfo> findByProductIdIn(List<String> productIdList);
    ProductInfo findByProductId(String productId);
}
