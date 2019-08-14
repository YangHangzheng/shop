package com.yanghz.payinfo.controller;

import com.yanghz.payinfo.service.impl.WeiXinPayService;
import com.yanghz.payinfo.service.impl.YinLianPayService;
import com.yanghz.payinfo.service.impl.ZhiFuBaoPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yanghangzheng
 * @date 2019/8/13 17:16
 */
@Controller
@RequestMapping("/payinfo")
public class PayController {

    @Autowired
    ZhiFuBaoPayService zhiFuBaoPayService;
    @Autowired
    WeiXinPayService weiXinPayService;
    @Autowired
    YinLianPayService yinLianPayService;

    @RequestMapping(value = "/paywithamount")
    public int payWithAmount(String payType, String tradeNumber, int amount) {
        int payResult = 2;
        if ("1".equals(payType)) {
            payResult = weiXinPayService.payWithpayAmount(tradeNumber, amount);
        } else if ("2".equals(payType)) {
            payResult = zhiFuBaoPayService.payWithpayAmount(tradeNumber, amount);
        } else if ("3".equals(payType)) {
            payResult = yinLianPayService.payWithpayAmount(tradeNumber, amount);
        }
        return payResult;
    }

}
