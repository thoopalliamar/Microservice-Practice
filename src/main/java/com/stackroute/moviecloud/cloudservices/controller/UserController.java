package com.stackroute.moviecloud.cloudservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.stackroute.moviecloud.cloudservices.services.CloudServices;

@RestController
@RequestMapping(value = "/api/v1")
public class UserController {

	CloudServices cloudservice;

	@Autowired
	public UserController(CloudServices cloudservice) {
		this.cloudservice = cloudservice;

	}

	@RequestMapping(value = "/movies", method = RequestMethod.GET, produces = { "application/json" })
	public ResponseEntity<String> saveUserController() {
		String controllersave = cloudservice.saveUser();
		
		return new ResponseEntity<String>(controllersave, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/movie", method = RequestMethod.GET, produces = { "application/json" })
	public ResponseEntity<String> getUserController() {
		String controllerget = cloudservice.getUsers();
		
		return new ResponseEntity<String>(controllerget, HttpStatus.OK);
	}
}
