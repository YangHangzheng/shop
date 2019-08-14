package com.yanghz.channelindex.dao;


import com.yanghz.channelindex.mapper.ProductMapper;
import com.yanghz.channelindex.model.Product;
import com.yanghz.channelindex.vo.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author yanghangzheng
 * @date 2019/7/8 11:34
 */
@Component
public class ProductDao {

    @Autowired
    ProductMapper productMapper;

    public void insertProduct(Product product) {
        productMapper.insertProduct(product);
    }

    public void updateAudit(Product product) {
        productMapper.updateAudit(product);
    }

    public Product findProductById(int id) {
        return productMapper.findProductById(id);
    }

    public void updateProduct(Product product) {productMapper.updateProduct(product);}

    public void deleteProduct(int id) {productMapper.deleteProduct(id);}

    public List<Product> queryPorduct(ProductVo productVo) {
        return productMapper.queryProduct(productVo);
    }

    public void updateProductByProductStatus(Product product) {
        productMapper.updateProductByProductStatus(product);
    }
}
