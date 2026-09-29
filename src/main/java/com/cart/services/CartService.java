package com.cart.services;

import com.cart.daos.CartDao;
import com.cart.daos.entity.Cart;
import com.rpf.inventory.beans.InventoryBean;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Log4j2
public class CartService {

    private final CartDao dao;

    public void save(InventoryBean bean) {

        try {
            Cart cart = new Cart();
            cart.setName(bean.getName());
            cart.setPrice(bean.getPrice());
            cart.setProductId(bean.getRecordId());
            cart.setUserId(bean.getUserId());
            dao.save(cart);
        } catch (Exception e) {
            log.error("Error in save cart ", e);
        }
    }
}
