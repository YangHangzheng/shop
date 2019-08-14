package com.yanghz.order.controller;

import com.yanghz.order.model.Order;
import com.yanghz.order.service.OrderService;
import com.yanghz.order.vo.OrderVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author yanghangzheng
 * @date 2019/7/21 15:48
 */
@Slf4j
@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/tocreateorder")
    public String toCreateOrder() {
        return "/order/createorder";
    }

    @PostMapping("/createorder")
    public void createOrder(Order order) {
        orderService.insertOrder(order);
    }

    @GetMapping("/queryorder")
    public String toQueryOrder(Model model) {
        OrderVo orderVo = new OrderVo();
        List<Order> orderList = orderService.queryOrder(orderVo);
        model.addAttribute("orderList", orderList);
        return "/order/orderlist";
    }

    @GetMapping("/toupdateorderbyuser")
    public String toUpdateOrderByUser(int id, Model model) {
        Order order = orderService.findOrderById(id);
        model.addAttribute("order", order);
        return "/order/updateOrderByUser";
    }

    @PostMapping("/updateorderbyuser")
    public void updateOrderByUser(Order order) {
        orderService.updateOrderByUser(order);
    }

    @GetMapping("/findorderbyid")
    public String findOrderById(int id, Model model) {
        Order order = orderService.findOrderById(id);
        model.addAttribute("order", order);
        return "/order/showorder";
    }


}
