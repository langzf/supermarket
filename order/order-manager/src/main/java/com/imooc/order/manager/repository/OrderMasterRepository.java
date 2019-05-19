package com.imooc.order.manager.repository;

import com.imooc.order.manager.entity.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author: langzhifa
 * Date: 2019/5/18
 * Time: 21:16
 * Description:
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {

    OrderMaster queryByOrderId(String orderId);

    List<OrderMaster> queryByBuyerOpenid(String buyerOpenid);

}
