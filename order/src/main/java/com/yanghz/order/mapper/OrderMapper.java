package com.yanghz.order.mapper;

import com.yanghz.order.model.Order;
import com.yanghz.order.vo.OrderVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author yanghangzheng
 * @date 2019/7/21 15:37
 */

@Mapper
public interface OrderMapper {

    void insertOrder(Order order);

    List<Order> queryOrder(OrderVo orderVo);

    void updateOrderByUser(Order order);

    Order findOrderById(int id);
}
