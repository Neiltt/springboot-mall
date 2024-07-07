package com.neil.springbootmall.dao;

import com.neil.springbootmall.dto.ProductRequset;
import com.neil.springbootmall.model.Product;
import org.springframework.stereotype.Component;

public interface ProductDao {
    Product getProdectById(Integer productId);

    Integer createProdect(ProductRequset productRequset);

    void updateProduct(Integer productId, ProductRequset productRequset);
}
