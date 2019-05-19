package com.imooc.common.dto;

import lombok.Data;

/**
 * User: langzhifa
 * Date: 2019/4/28
 * Time: 21:56
 * Description:
 */
@Data
public class ResultDTO<T> {

    private final static Integer SUCCESS_CODE = 200;
    private final static Integer FAIL_CODE = 500;

    private final static String SUCCESS_MESSAGE = "success";

    private Integer code;
    private String message;
    private Boolean success;
    private String localMessage;
    private T data;

    public ResultDTO(Integer code, String message, Boolean success) {
        this.code = code;
        this.message = message;
        this.success = success;
    }

    public ResultDTO(Integer code, String message, Boolean success, String localMessage) {
        this.code = code;
        this.message = message;
        this.success = success;
        this.localMessage = localMessage;
    }

    public ResultDTO(T data) {
        this.message=SUCCESS_MESSAGE;
        this.code= SUCCESS_CODE;
        this.data = data;
    }
}

