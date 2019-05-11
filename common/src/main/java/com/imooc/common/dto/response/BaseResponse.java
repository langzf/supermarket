package com.imooc.common.dto.response;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * User: langzhifa
 * Date: 2019/4/28
 * Time: 0:41
 * Description:
 */
@Data
public class BaseResponse implements Serializable {

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;
}
