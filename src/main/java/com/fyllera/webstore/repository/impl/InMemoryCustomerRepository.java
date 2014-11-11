package com.fyllera.webstore.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.fyllera.webstore.domain.Customer;
import com.fyllera.webstore.repository.CustomerRepository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {

	private List<Customer> listOfCustomers = new ArrayList<Customer>();
	
	public InMemoryCustomerRepository() {
		Customer jim = new Customer();
		jim.setName("Jim Carrey");
		jim.setAddress("Address 123");
		jim.setCustomerId(1);
		jim.setNoOfOrdersMade(10);
		
		Customer arnold = new Customer();
		arnold.setName("Arnold Schwarzenegger");
		arnold.setAddress("Adress 321");
		arnold.setCustomerId(2);
		arnold.setNoOfOrdersMade(300);
		
		listOfCustomers.add(jim);
		listOfCustomers.add(arnold);
	}
	
	public List<Customer> getAllCustomers() {
		return listOfCustomers;
	}
}
