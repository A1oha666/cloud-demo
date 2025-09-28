package com.demo.bean;

import lombok.Data;

import java.math.BigDecimal;


@Data
public class Product {
    private Long productId;
    private String productName;
    private BigDecimal productPrice;
    private Integer num;

}
