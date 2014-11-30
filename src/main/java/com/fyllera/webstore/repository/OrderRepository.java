package com.fyllera.webstore.repository;

import com.fyllera.webstore.domain.Order;

public interface OrderRepository {
	Long saveOrder(Order order);
}
