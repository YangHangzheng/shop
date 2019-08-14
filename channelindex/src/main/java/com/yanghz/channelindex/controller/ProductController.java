package com.yanghz.channelindex.controller;


import com.yanghz.channelindex.model.Product;
import com.yanghz.channelindex.service.ProductService;
import com.yanghz.channelindex.vo.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

/**
 * @author yanghangzheng
 * @date 2019/7/8 14:32
 */

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;



    @GetMapping("/productlist")
    public String queryList(Model model) {
        ProductVo productVo = new ProductVo();
        List<Product> productlist = productService.queryProduct(productVo);
        model.addAttribute("productlist", productlist);
        return "/product/productlist";
    }



}
