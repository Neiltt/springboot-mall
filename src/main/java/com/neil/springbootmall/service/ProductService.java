package com.neil.springbootmall.service;

import com.neil.springbootmall.dto.ProductRequset;
import com.neil.springbootmall.model.Product;

public interface ProductService {
    Product getProdectById(Integer productId);

    Integer createProdect(ProductRequset productRequset);
}
