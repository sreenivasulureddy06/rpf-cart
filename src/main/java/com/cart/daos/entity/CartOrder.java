package com.cart.daos.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "RPF_CART_ORDER")
@Data
public class CartOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RECORD_ID")
    private Long recordId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PRICE")
    private Double price;

    @Column(name = "ORDER_ID")
    private UUID orderId;

    public CartOrder populateData() {
        CartOrder bean = new CartOrder();
        bean.setRecordId(this.recordId);
        bean.setName(this.name);
        bean.setPrice(this.price);
        bean.setOrderId(this.orderId);
        return bean;
    }
}
