package com.imooc.account.manager.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author : langzhifa
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = "com.imooc.account.manager")
public class AccountManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountManagerApplication.class, args);
    }

}
