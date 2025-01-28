package com.Insturmentrade.order_service.Entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private Long productId;
    private String status; // Pending, Completed, Cancelled
    private LocalDateTime orderDate = LocalDateTime.now();
    private BigDecimal totalPrice;

    // Getters and Setters
}
