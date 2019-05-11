package com.imooc.common.dto;

import lombok.Data;

/**
 * User: langzhifa
 * Date: 2019/4/28
 * Time: 21:56
 * Description:
 */
@Data
public class ReusltDTO {

    private Integer code;
    private String message;
    private Boolean success;
    private String localMessage;
    private Data data;

    public ReusltDTO(Integer code, String message, Boolean success) {
        this.code = code;
        this.message = message;
        this.success = success;
    }

    public ReusltDTO(Integer code, String message, Boolean success, String localMessage) {
        this.code = code;
        this.message = message;
        this.success = success;
        this.localMessage = localMessage;
    }

    public ReusltDTO(String message, Data data) {

        this.message = message;
        this.data = data;
    }
}

