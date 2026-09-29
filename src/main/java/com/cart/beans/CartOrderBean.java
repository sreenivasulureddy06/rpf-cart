package com.cart.beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.Column;
import lombok.Data;

import java.util.UUID;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CartOrderBean {
    private Long recordId;

    private String name;

    private Double price;

    private UUID orderId;
}
