package com.cart.beans;

import lombok.Data;

@Data
public class CartBean {
    private Long recordId;

    private String name;

    private Double price;

    private Long productId;

    private Long userId;
}
