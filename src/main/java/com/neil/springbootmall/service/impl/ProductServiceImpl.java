package com.neil.springbootmall.service.impl;

import com.neil.springbootmall.constant.ProductCategory;
import com.neil.springbootmall.dao.ProductDao;
import com.neil.springbootmall.dto.ProductRequset;
import com.neil.springbootmall.model.Product;
import com.neil.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> getProducts(ProductCategory category, String search) {
        return productDao.getProducts(category, search);
    }

    @Override
    public Product getProdectById(Integer productId) {
        return productDao.getProdectById(productId);
    }

    @Override
    public Integer createProdect(ProductRequset productRequset) {
        return productDao.createProdect(productRequset);
    }

    @Override
    public void updateProduct(Integer productId, ProductRequset productRequset) {
        productDao.updateProduct(productId, productRequset);
    }

    @Override
    public void deleteProductById(Integer productId) {
        productDao.deleteProductById(productId);
    }


}
