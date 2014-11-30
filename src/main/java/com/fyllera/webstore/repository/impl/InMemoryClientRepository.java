package com.fyllera.webstore.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.fyllera.webstore.domain.Client;
import com.fyllera.webstore.repository.ClientRepository;

@Repository
public class InMemoryClientRepository implements ClientRepository {

	private List<Client> listOfClients = new ArrayList<Client>();
	
	public InMemoryClientRepository() {
		Client jim = new Client();
		jim.setName("Jim Carrey");
		jim.setAddress("Address 123");
		jim.setClientId(1);
		jim.setNoOfOrdersMade(10);
		
		Client arnold = new Client();
		arnold.setName("Arnold Schwarzenegger");
		arnold.setAddress("Adress 321");
		arnold.setClientId(2);
		arnold.setNoOfOrdersMade(300);
		
		listOfClients.add(jim);
		listOfClients.add(arnold);
	}
	
	public List<Client> getAllClients() {
		return listOfClients;
	}
}
