package com.example.accessingdatamongodb;

import org.springframework.stereotype.Service;
import java.util.HashMap;

@Service
public class OrderService implements OrderI {
    HashMap<String, Order> orderRepo = new HashMap<String, Order>();

    //@Override
    public String createOrder(Order order) {
        orderRepo.put(order.getOrderId(), order);
        return order.getOrderId() + "created!";
    }
    //@Overrides
    public HashMap<String, Order> getAllOrders(){
        return orderRepo;
    }
    //@Override
    public Order getOrderById(String orderId) {
        return orderRepo.get(orderId);
    }
    //@Override
    public String deleteOrderById(String orderId) {
        orderRepo.remove(orderId);
        return "deleted!";
    }


}