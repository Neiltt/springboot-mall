package com.neil.springbootmall.dao;

import com.neil.springbootmall.dto.OrderQueryParams;
import com.neil.springbootmall.model.OrderItem;

import java.util.List;
import com.neil.springbootmall.model.Order;

public interface OrderDao {

    Integer countOrders(OrderQueryParams orderQueryParams);
    List<Order> getOrders(OrderQueryParams orderQueryParams);
    Order getOrderById(Integer orderId);
    List<OrderItem> getOrderItemsByOrderId(Integer orderId);
    Integer createOrder(Integer userId, Integer totalAmount);
    void createOrderItems(Integer orderId, List<OrderItem> orderItemList);
}
