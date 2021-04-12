package com.example.accessingdatamongodb;

import java.util.HashMap;

public interface OrderI {
    public String createOrder(Order order);
    public HashMap<String, Order> getAllOrders();
    public Order getOrderById(String orderId);
    public String deleteOrderById(String orderId);
}