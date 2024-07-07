package com.neil.springbootmall.service;

import com.neil.springbootmall.constant.ProductCategory;
import com.neil.springbootmall.dto.ProductRequset;
import com.neil.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);
    Product getProdectById(Integer productId);

    Integer createProdect(ProductRequset productRequset);

    void updateProduct(Integer productId, ProductRequset productRequset);

    void deleteProductById(Integer productId);
}
