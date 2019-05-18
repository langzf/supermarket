package com.imooc.product.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * User: langzhifa
 * Date: 2019/5/12
 * Time: 15:52
 * Description:
 */
@Data
@Component
@ConfigurationProperties("product")
@RefreshScope
public class ProductConfig {

    private String category;

}
