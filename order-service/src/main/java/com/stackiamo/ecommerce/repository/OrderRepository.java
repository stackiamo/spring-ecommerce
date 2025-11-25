package com.stackiamo.ecommerce.repository;

import com.stackiamo.ecommerce.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface OrderRepository extends JpaRepository<Order, Long> {

}
