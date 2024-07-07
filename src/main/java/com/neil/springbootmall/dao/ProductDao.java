package com.neil.springbootmall.dao;

import com.neil.springbootmall.constant.ProductCategory;
import com.neil.springbootmall.dto.ProductRequset;
import com.neil.springbootmall.model.Product;
import org.springframework.stereotype.Component;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category, String search);
    Product getProdectById(Integer productId);

    Integer createProdect(ProductRequset productRequset);

    void updateProduct(Integer productId, ProductRequset productRequset);

    void deleteProductById(Integer productId);
}
