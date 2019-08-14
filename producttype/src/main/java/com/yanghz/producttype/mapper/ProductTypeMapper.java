package com.yanghz.producttype.mapper;

import com.yanghz.producttype.model.ProductType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author yanghangzheng
 * @date 2019/7/2 8:55
 */
@Mapper
public interface ProductTypeMapper {

    void insertProductType(ProductType productType);
    ProductType findProductTypeById(int id);
    ProductType updateProductType(ProductType productType);
    List<ProductType> queryProductType();
    void deleteProductType(int id);

}
