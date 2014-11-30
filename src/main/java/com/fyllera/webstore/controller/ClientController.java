package com.fyllera.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fyllera.webstore.service.ClientService;

@Controller
public class ClientController {
	
	@Autowired
	private ClientService clientsService;
	
	@RequestMapping("/clients")
	public String getClient(Model model) {
		model.addAttribute("clients", clientsService.getAllClients());
		return "clients";
	}
}
