package com.neil.springbootmall.dao;

import com.neil.springbootmall.model.Product;
import org.springframework.stereotype.Component;

public interface ProductDao {
    Product getProdectById(Integer productId);

}
