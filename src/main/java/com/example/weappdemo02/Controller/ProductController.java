package com.example.weappdemo02.Controller;

import com.example.weappdemo02.common.ResponseData;
import com.example.weappdemo02.mapper.ProductMapper;
import com.example.weappdemo02.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 罗云之
 */
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/productList")
    public ResponseData productList(){

        return ResponseData.ok(productService.getProductList());
    }
    @GetMapping("/testList")
    public ResponseData testList(){

        return ResponseData.ok(productService.getProductList());
    }
}
