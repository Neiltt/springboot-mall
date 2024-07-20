package com.neil.springbootmall.dao;

import com.neil.springbootmall.model.OrderItem;

import java.util.List;
import com.neil.springbootmall.model.Order;

public interface OrderDao {

    Order getOrderById(Integer orderId);
    List<OrderItem> getOrderItemsByOrderId(Integer orderId);
    Integer createOrder(Integer userId, Integer totalAmount);
    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
