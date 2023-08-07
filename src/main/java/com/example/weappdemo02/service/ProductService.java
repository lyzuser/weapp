package com.example.weappdemo02.service;


import com.example.weappdemo02.bean.Product;
import com.example.weappdemo02.common.ResponseData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    List<Product> getProductList();
}
