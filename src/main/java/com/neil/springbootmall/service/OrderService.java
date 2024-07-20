package com.neil.springbootmall.service;

import com.neil.springbootmall.dto.CreateOrderRequest;
import com.neil.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

}
