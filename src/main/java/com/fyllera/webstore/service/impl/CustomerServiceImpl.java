package com.fyllera.webstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fyllera.webstore.domain.Customer;
import com.fyllera.webstore.repository.CustomerRepository;
import com.fyllera.webstore.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> getAllCustomers() {
		return customerRepository.getAllCustomers();
	}
}
