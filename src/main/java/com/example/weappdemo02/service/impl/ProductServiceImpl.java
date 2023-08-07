package com.example.weappdemo02.service.impl;


import com.example.weappdemo02.bean.Product;
import com.example.weappdemo02.mapper.ProductMapper;
import com.example.weappdemo02.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 罗云之
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Override
    public List<Product> getProductList() {
        return productMapper.selectAllProduct();
    }
}
