package com.yanghz.channelindex.service;

import com.yanghz.channelindex.dao.ProductDao;
import com.yanghz.channelindex.model.Product;
import com.yanghz.channelindex.vo.ProductVo;
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

    public List<Product> queryProduct(ProductVo productVo) {
        return productDao.queryPorduct(productVo);
    }

}
