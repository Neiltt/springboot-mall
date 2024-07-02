package com.neil.springbootmall.service.impl;

import com.neil.springbootmall.dao.ProductDao;
import com.neil.springbootmall.model.Product;
import com.neil.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProdectById(Integer productId) {
        return productDao.getProdectById(productId);
    }
}
