package com.yanghz.channelindex.model;

import lombok.Data;

import java.util.Date;

/**
 * @author yanghangzheng
 * @date 2019/7/8 11:02
 */
@Data
public class Product {

    private Integer id;
    private Integer productTypeId;
    private String productTitle;
    private Double productPrice;
    private Integer mechartId;
    private Date createTime;
    private Date auditTime;
    private Integer auditState;
    private Integer stockNum;
    private Integer sellNum;
    private String productPicUrl;
    private Integer productStatus;

}
