package com.yanghz.producttype.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.yanghz.producttype.model.ProductType;
import com.yanghz.producttype.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author yanghangzheng
 * @date 2019/7/2 9:54
 */

@Controller
@RequestMapping("/producttype")
public class ProductTypeController {

    @Autowired
    ProductTypeService productTypeService;


    @PostMapping("/insertproducttype")
    public void insertProductType(ProductType productType) {
        productTypeService.insertProductType(productType);
    }

    @GetMapping("/toinsertproducttype")
    public String toInsertProductType(int id, Model model) {
        ProductType productType = productTypeService.findProductTypeById(id);
        if(productType == null) {
            productType = new ProductType();
            productType.setId(-1);
        }
        model.addAttribute("productType", productType);
        return "/producttype/producttypeadd";
    }

    @GetMapping("/findproducttypebyid")
    public String findProductTypeById(int id, Model model) {
        ProductType productType = productTypeService.findProductTypeById(id);
        model.addAttribute("productType", productType);
        return "/producttype/findproducttypebyid";
    }

    @GetMapping("/toproducttypeupdate")
    public String toupdateProductType(int id, Model model) {
        ProductType productType = productTypeService.findProductTypeById(id);
        model.addAttribute("productType", productType);
        return "/producttype/producttypeupdate";
    }

    @PostMapping("/producttypeupdate")
    public void updateProductType(ProductType productType) {
        productTypeService.updateProductType(productType);
    }

    @GetMapping("/queryproducttype")
    public String queryProductType(Model model) {
        List<ProductType> listProductType = productTypeService.queryProductType();
        model.addAttribute("listProductType", listProductType);
        return "/producttype/producttypelist";
    }

    @GetMapping("/deleteproducttype")
    public void deleteProductType(int id) {
        productTypeService.deleteProductType(id);
    }

}
