package com.nelioalves.backend.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.backend.domain.Client;
import com.nelioalves.backend.services.ClientService;

@RestController
@RequestMapping(value="clients")
public class ClientResource {
	
	@Autowired
	private ClientService service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Client> find (@PathVariable Integer id) {
		
		Client client = service.find(id);
		return ResponseEntity.ok(client);
	}

}
