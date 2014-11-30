package com.fyllera.webstore.service;

import com.fyllera.webstore.domain.Order;

public interface OrderService {
	void processOrder(String productId, long quantity);
	Long saveOrder(Order order);
}
