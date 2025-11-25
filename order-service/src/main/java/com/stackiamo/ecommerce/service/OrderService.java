package com.stackiamo.ecommerce.service;

import com.stackiamo.ecommerce.entity.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    List<Order> findAll();
    Optional<Order> findById(Long id);
    void save(Order product);
}
