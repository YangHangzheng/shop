package com.yanghz.product.controller;

import com.yanghz.product.model.Product;
import com.yanghz.product.service.ProductService;
import com.yanghz.product.vo.ProductVo;
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

    @GetMapping("/toaddproduct")
    public String toInsertProduct() {
        return "/product/addproduct";
    }

    @PostMapping("/addproduct")
    public void insertProduct(Product product) {
        product.setCreateTime(new Date());
        product.setSellNum(0);
        product.setProductStatus(0);
        productService.insertProduct(product);
    }

    @GetMapping("/findproductbyid")
    public String findProductById(int id, Model model) {
        Product product = productService.findProductById(id);
        model.addAttribute("product", product);
        return "/product/findproductbyid";
    }

    @GetMapping("/toauditproduct")
    public String toAuditProduct(int id, Model model) {
        Product product = productService.findProductById(id);
        model.addAttribute("product", product);
        return "/product/auditproduct";
    }


    @PostMapping("/auditproduct")
    public void auditProduct(int id, int auditState) {
        productService.updateAudit(id, auditState);
    }

    @GetMapping("/toupdateproduct")
    public String toUpdateProduct(int id, Model model) {
        Product product = productService.findProductById(id);
        model.addAttribute("product", product);
        return "/product/updateproduct";
    }

    @PostMapping("/updateproduct")
    public void updateProduct(Product product) {
        productService.updateProduct(product);
    }

    @GetMapping("/deleteproduct")
    public void deleteProduct(int id) {
        productService.deleteProduct(id);
    }

    @GetMapping("/productlist")
    public String queryList(Model model) {
        ProductVo productVo = new ProductVo();
        List<Product> productlist = productService.queryProduct(productVo);
        model.addAttribute("productlist", productlist);
        return "/product/productlist";
    }



    @GetMapping("/updateproductbyproductstatus")
    public void updateProductByProductStatus(int id, int productStatus) {
        productService.updateProductByProductStatus(id, productStatus);
    }


}
