package com.fyllera.webstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fyllera.webstore.domain.Client;
import com.fyllera.webstore.repository.ClientRepository;
import com.fyllera.webstore.service.ClientService;

@Service
public class CustomerServiceImpl implements ClientService {

	@Autowired
	private ClientRepository customerRepository;
	
	public List<Client> getAllClients() {
		return customerRepository.getAllClients();
	}
}
