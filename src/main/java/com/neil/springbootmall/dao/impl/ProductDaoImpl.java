package com.neil.springbootmall.dao.impl;

import com.neil.springbootmall.dao.ProductDao;
import com.neil.springbootmall.model.Product;
import com.neil.springbootmall.rowmapper.ProductRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

@Component
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public Product getProdectById(Integer productId) {
        String sql = "SELECT product_id, product_name, category, image_url, price, stock, description, " +
                "created_date, last_modified_date " +
                "FROM product WHERE  product_id = :prodcutId";

        Map<String, Object> map = new HashMap<>();
        map.put("prodcutId", productId);

        List<Product> productList = namedParameterJdbcTemplate.query(sql, map, new ProductRowMapper());
        if(productList.size() > 0){
            return productList.get(0);
        } else {
            return null;
        }
    }
}
