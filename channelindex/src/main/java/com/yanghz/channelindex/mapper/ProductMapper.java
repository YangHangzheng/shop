package com.yanghz.channelindex.mapper;


import com.yanghz.channelindex.model.Product;
import com.yanghz.channelindex.vo.ProductVo;
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
