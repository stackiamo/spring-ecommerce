package com.stackiamo.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Table(name = "reg_products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", nullable = false)
    Long productId;

    @Column(name = "product_code")
    String productCode;

    @Column(name = "product_description")
    String productDescription;

    @Column(name = "product_price")
    BigDecimal productPrice;

    @Column(name = "insert_ts", nullable = false)
    LocalDateTime insertTs;
}
