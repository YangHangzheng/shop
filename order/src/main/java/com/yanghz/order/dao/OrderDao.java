package com.yanghz.order.dao;

import com.yanghz.order.mapper.OrderMapper;
import com.yanghz.order.model.Order;
import com.yanghz.order.vo.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author yanghangzheng
 * @date 2019/7/21 15:45
 */

@Component
public class OrderDao {

    @Autowired
    OrderMapper orderMapper;

    public void insertOrder(Order order) {
        orderMapper.insertOrder(order);
    }

    public List<Order> queryOrder(OrderVo orderVo) {
        return orderMapper.queryOrder(orderVo);
    }


    public void updateOrderByUser(Order order) {
        orderMapper.updateOrderByUser(order);
    }

    public Order findOrderById(int id) {
        return orderMapper.findOrderById(id);
    }

}
