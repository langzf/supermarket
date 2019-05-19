package com.imooc.order.manager.repository;

import com.imooc.order.manager.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author: langzhifa
 * Date: 2019/5/18
 * Time: 21:20
 * Description:
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {

    List<OrderDetail> queryByOrderId(String orderId);

    OrderDetail queryByDetailId(String detailId);

}
