package com.yanghz.product.mapper;

import com.yanghz.product.model.Product;
import com.yanghz.product.vo.CustomerProduct;
import com.yanghz.product.vo.ProductVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author yanghangzheng
 * @date 2019/7/8 11:09
 */

@Mapper
public interface ProductMapper {

    void insertProduct(Product product);

    void updateAudit(Product product);

    Product findProductById(int id);

    void updateProduct(Product product);

    void deleteProduct(int id);

    List<Product> queryProduct(ProductVo productVo);

    void updateProductByProductStatus(Product product);
}
