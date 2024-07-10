package com.neil.springbootmall.dao;

import com.neil.springbootmall.dto.ProductQueryParams;
import com.neil.springbootmall.dto.ProductRequset;
import com.neil.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProdectById(Integer productId);

    Integer createProdect(ProductRequset productRequset);

    void updateProduct(Integer productId, ProductRequset productRequset);

    void deleteProductById(Integer productId);
}
