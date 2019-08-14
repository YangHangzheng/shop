package com.yanghz.order.service;

import com.yanghz.order.dao.OrderDao;
import com.yanghz.order.model.Order;
import com.yanghz.order.vo.OrderVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author yanghangzheng
 * @date 2019/7/21 15:46
 */

@Service
public class OrderService {

    @Autowired
    OrderDao orderDao;

    public void insertOrder(Order order) {
        Date nowDate = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddhhmmss");
        String dateString = dateFormat.format(nowDate);
        String tradeNumber = UUID.randomUUID() + dateString;
        order.setCreateTime(nowDate);
        order.setTradeNumber(tradeNumber);
        order.setOrderStatus(0);
        orderDao.insertOrder(order);
    }

    public List<Order> queryOrder(OrderVo orderVo) {
        return orderDao.queryOrder(orderVo);
    }

    public void updateOrderByUser(Order order) {
        orderDao.updateOrderByUser(order);
    }

    public Order findOrderById(int id) {
        return orderDao.findOrderById(id);
    }

}
