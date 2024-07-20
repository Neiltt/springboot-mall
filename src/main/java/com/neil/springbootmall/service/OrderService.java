package com.neil.springbootmall.service;

import com.neil.springbootmall.dto.CreateOrderRequest;
import com.neil.springbootmall.dto.OrderQueryParams;
import com.neil.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    List<Order> getOrders(OrderQueryParams orderQueryParams);
    Integer countOrders(OrderQueryParams orderQueryParams);
    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

}
