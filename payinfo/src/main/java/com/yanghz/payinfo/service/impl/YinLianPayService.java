package com.yanghz.payinfo.service.impl;

import com.yanghz.payinfo.service.PayService;
import org.springframework.stereotype.Service;

/**
 * @author yanghangzheng
 * @date 2019/8/13 17:12
 */

@Service
public class YinLianPayService implements PayService {
    public int payWithpayAmount(String tradeNumber, int amount) {
        System.out.println("银联支付成功");

        return 0;
    }
}
