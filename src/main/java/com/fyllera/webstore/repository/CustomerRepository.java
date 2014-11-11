package com.fyllera.webstore.repository;

import java.util.List;

import com.fyllera.webstore.domain.Customer;

public interface CustomerRepository {
	List<Customer> getAllCustomers();
}
