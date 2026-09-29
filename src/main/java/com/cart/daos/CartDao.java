package com.cart.daos;

import com.cart.daos.entity.Cart;
import com.cart.daos.repo.CartRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class CartDao {

    private final CartRepo repo;

    public Cart save(Cart cart) {
        return repo.save(cart);
    }
}
