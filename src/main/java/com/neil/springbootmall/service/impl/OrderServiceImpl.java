package com.neil.springbootmall.service.impl;

import com.neil.springbootmall.dao.OrderDao;
import com.neil.springbootmall.dao.ProductDao;
import com.neil.springbootmall.dto.BuyItem;
import com.neil.springbootmall.dto.CreateOrderRequest;
import com.neil.springbootmall.model.Order;
import com.neil.springbootmall.model.OrderItem;
import com.neil.springbootmall.model.Product;
import com.neil.springbootmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private ProductDao productDao;

    @Override
    public Order getOrderById(Integer orderId) {
        Order order = orderDao.getOrderById(orderId);
        List<OrderItem> orderItemList = orderDao.getOrderItemsByOrderId(orderId);
        order.setOrderItemList(orderItemList);
        return order;
    }

    @Transactional
    @Override
    public Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest) {

        int totalAmount = 0;
        List<OrderItem> orderItemList = new ArrayList<>();

        for (BuyItem buyItem: createOrderRequest.getBuyItemList()){
            Product product = productDao.getProdectById(buyItem.getProductId());
            // 總價計算
            int amount = buyItem.getQuantity() * product.getPrice();
            totalAmount = totalAmount + amount;

            // BuyItem 2 OrderItem
            OrderItem orderItem = new OrderItem();
            orderItem.setProductId(buyItem.getProductId());
            orderItem.setQuantity(buyItem.getQuantity());
            orderItem.setAmount(amount);

            orderItemList.add(orderItem);
        }
        // 創建訂單
        Integer orderId = orderDao.createOrder(userId, totalAmount);
        orderDao.createOrderItems(orderId, orderItemList);
        return orderId;
    }
}
