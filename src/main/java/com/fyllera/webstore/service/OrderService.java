package com.fyllera.webstore.service;

public interface OrderService {
	void processOrder(String productId, long quantity);
}
