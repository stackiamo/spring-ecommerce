package com.stackiamo.ecommerce.controller;

import com.stackiamo.ecommerce.dto.ProductDTO;
import com.stackiamo.ecommerce.entity.Product;
import com.stackiamo.ecommerce.exception.BindingException;
import com.stackiamo.ecommerce.service.ProductService;
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
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("")
    public List<Product> getAllCities() {
        return productService.findAll();
    }


    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable(value = "id") Long id) {

        Product product = productService.findById(id).orElseThrow();

        return ResponseEntity.ok(product);
    }

    @PostMapping("")
    public ResponseEntity<Product> insertProduct(@RequestBody ProductDTO dto) {
        Product product = new Product();
        try {
            product.setProductCode(dto.getProductCode());
            product.setProductDescription(dto.getProductDescription());
            product.setProductPrice(dto.getProductPrice());
            product.setInsertTs(LocalDateTime.now());

            productService.save(product);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
            return ResponseEntity.ok(product);
        }
}
