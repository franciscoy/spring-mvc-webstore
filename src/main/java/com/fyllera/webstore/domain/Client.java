package com.fyllera.webstore.domain;

public class Client {
	
	private int clientId;
	private String name;
	private String address;
	private int noOfOrdersMade;
	
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int customerId) {
		this.clientId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNoOfOrdersMade() {
		return noOfOrdersMade;
	}
	public void setNoOfOrdersMade(int noOfOrdersMade) {
		this.noOfOrdersMade = noOfOrdersMade;
	}
	
}
