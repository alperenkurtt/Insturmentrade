package com.Insturmentrade.order_service.Service;

import com.Insturmentrade.order_service.Entity.Order;
import com.Insturmentrade.order_service.Repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> findOrdersByUser(Long userId) {
        return orderRepository.findByUserId(userId);
    }

    public Order placeOrder(Order order) {
        return orderRepository.save(order);
    }
}
