package com.yanghz.product.service;

import com.yanghz.product.dao.ProductDao;
import com.yanghz.product.model.Product;
import com.yanghz.product.vo.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author yanghangzheng
 * @date 2019/7/8 14:31
 */

@Service
public class ProductService {

    @Autowired
    ProductDao productDao;

    public void insertProduct(Product product) {
        productDao.insertProduct(product);
    }

    public void updateAudit(int id, int auditState) {
        Product product = new Product();
        product.setId(id);
        product.setAuditState(auditState);
        product.setAuditTime(new Date());
        productDao.updateAudit(product);
    }

    public Product findProductById(int id){
        return productDao.findProductById(id);
    }

    public void updateProduct(Product product) {
        productDao.updateProduct(product);
    }

    public void deleteProduct(int id) {
        productDao.deleteProduct(id);
    }

    public List<Product> queryProduct(ProductVo productVo) {
        return productDao.queryPorduct(productVo);
    }

    public void updateProductByProductStatus(int id, int productStatus) {
        Product product = new Product();
        product.setId(id);
        product.setProductStatus(productStatus);
        productDao.updateProductByProductStatus(product);
    }
}
