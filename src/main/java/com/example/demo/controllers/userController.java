package com.example.demo.controllers;

import javax.persistence.criteria.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.services.UserServiceClient;
import com.example.demo.services.userService;

@RestController
public class userController 
{
	@Autowired
	private userService userService;
	
	@Autowired
	private UserServiceClient userServiceClient;
	
	
	@GetMapping("/getUsers/{id}")
	public ResponseEntity<User> getUsers(@PathVariable Long id)
	{
		userService.getUser(id);
		
		//this will communicate to second service for getting the user orders 
		Order order = userServiceClient.usersOrders(id);
		
		//create Order object and set the values 
		
		//like order.setId(order.getId());
		//order.setTotalOrders(order.getTotalOrders())
		
		return new ResponseEntity<User>(HttpStatus.OK);
		
	}

}
