package com.neil.springbootmall.dao;

import com.neil.springbootmall.dto.ProductQueryParams;
import com.neil.springbootmall.dto.ProductRequest;
import com.neil.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProdectById(Integer productId);

    Integer createProdect(ProductRequest productRequset);

    void updateProduct(Integer productId, ProductRequest productRequset);

    void deleteProductById(Integer productId);

    void updateStock(Integer productId, Integer stock);

}
