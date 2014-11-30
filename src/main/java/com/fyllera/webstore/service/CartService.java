package com.fyllera.webstore.service;

import com.fyllera.webstore.domain.Cart;

public interface CartService {
	Cart create(Cart cart);
    Cart read(String cartId);
    void update(String cartId, Cart cart);
    void delete(String cartId);
    Cart validate(String cartId);
}