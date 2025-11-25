package com.stackiamo.ecommerce.controller;

import com.stackiamo.ecommerce.dto.OrderDTO;
import com.stackiamo.ecommerce.entity.Order;
import com.stackiamo.ecommerce.exception.BindingException;
import com.stackiamo.ecommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;


    @GetMapping("")
    public List<Order> getAllCities() {
        return orderService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> findById(@PathVariable(value = "id") Long id) {

        Order order = orderService.findById(id).orElseThrow();

        return ResponseEntity.ok(order);
    }

    @PostMapping("")
    public ResponseEntity<Order> insertProduct(@RequestBody OrderDTO dto) {
        Order order = new Order();
        try {
            order.setStatus(dto.getStatus());
            order.setUserId(1L);
            order.setProductId(dto.getProductId());
            order.setOrderTs(LocalDateTime.now());

            orderService.save(order);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return ResponseEntity.ok(order);
    }
}
