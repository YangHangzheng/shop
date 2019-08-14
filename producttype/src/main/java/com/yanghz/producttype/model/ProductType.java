package com.yanghz.producttype.model;

/**
 * @author yanghangzheng
 * @date 2019/7/2 8:57
 */

import lombok.Data;

@Data
public class ProductType {

    private Integer id;
    private String productTypeName;
    private String productTypeDesc;
    private Integer typeGrade;
    private Integer parentId;

}
