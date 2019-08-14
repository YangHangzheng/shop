package com.yanghz.producttype.service;

import com.yanghz.producttype.dao.ProductTypeDao;
import com.yanghz.producttype.model.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yanghangzheng
 * @date 2019/7/2 9:50
 */

@Service
public class ProductTypeService {

    @Autowired
    ProductTypeDao productTypeDao;

    public ProductType findProductTypeById(int id) {
        return productTypeDao.findProductTypeById(id);
    }

    public void insertProductType(ProductType productType) {
        productTypeDao.insertProductType(productType);
    }

    public ProductType updateProductType(ProductType productType) {
        return productTypeDao.updateProductType(productType);
    }

    public List<ProductType> queryProductType() {
        return productTypeDao.queryProductType();
    }

    public void deleteProductType(int id) {
        productTypeDao.deleteProductType(id);
    }
}
