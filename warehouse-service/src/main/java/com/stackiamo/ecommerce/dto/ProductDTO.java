package com.stackiamo.ecommerce.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@NoArgsConstructor
public class ProductDTO {
    String productCode;
    String productDescription;
    BigDecimal productPrice;
}
