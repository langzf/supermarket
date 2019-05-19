package com.imooc.order.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @au: langzhifa
 * Date: 2019/5/18
 * Time: 18:54
 * Description:
 */
@Data
public class OrderMasterRequestDTO implements Serializable {
    private static final long serialVersionUID = -1632788544379241246L;

    private String orderId;

}
