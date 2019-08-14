package com.yanghz.order.model;

import lombok.Data;

import java.util.Date;

/**
 * @author yanghangzheng
 * @date 2019/7/21 15:31
 */

@Data
public class Order {

    private Integer id;
    private Integer payAmount;
    private Integer userId;
    private Date createTime;
    private Integer payStatus;
    private Date payTime;
    private String consigneeAddress;
    private String consigneePhone;
    private String consigneeName;
    private Integer payType;
    private String tradeNumber;
    private Integer orderStatus;

}
