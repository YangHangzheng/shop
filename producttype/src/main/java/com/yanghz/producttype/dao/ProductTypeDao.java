package com.yanghz.producttype.dao;

import com.yanghz.producttype.mapper.ProductTypeMapper;
import com.yanghz.producttype.model.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author yanghangzheng
 * @date 2019/7/2 9:29
 */
@Component
public class ProductTypeDao {

    @Autowired
    ProductTypeMapper productTypeMapper;

    public ProductType findProductTypeById(int id){
        return productTypeMapper.findProductTypeById(id);
    }

    public void insertProductType(ProductType productType) {
        productTypeMapper.insertProductType(productType);
    }

    public ProductType updateProductType(ProductType productType) {
        return productTypeMapper.updateProductType(productType);
    }

    public List<ProductType> queryProductType() {
        return productTypeMapper.queryProductType();
    }

    public void deleteProductType(int id) {
        productTypeMapper.deleteProductType(id);
    }

}
