package com.yanghz.product.model;

import lombok.Data;

/**
 * @author yanghangzheng
 * @date 2019/7/8 11:06
 */

@Data
public class ProductDetail {

    private Integer id;
    private Integer productId;
    private String productPlace;
    private String productTitle;
    private String productBrand;
    private String productWeight;
    private String productSpecification;
    private String productDetailPicUrl;

}
