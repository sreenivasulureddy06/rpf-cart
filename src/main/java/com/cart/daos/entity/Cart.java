package com.cart.daos.entity;

import com.cart.beans.CartBean;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "RPF_CART")
@Data
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RECORD_ID")
    private Long recordId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PRICE")
    private Double price;

    @Column(name = "PRODUCT_ID")
    private Long productId;

    @Column(name = "USER_ID")
    private Long userId;

    public CartBean populateData() {
        CartBean bean = new CartBean();
        bean.setRecordId(this.recordId);
        bean.setName(this.name);
        bean.setPrice(this.price);
        bean.setProductId(this.productId);
        bean.setUserId(this.userId);
        return bean;
    }
}
