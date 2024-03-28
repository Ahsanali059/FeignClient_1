package com.example.demo.services;

import javax.persistence.criteria.Order;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.User;

//second microservice Url 
@FeignClient(name = "user-service",url = "http://localhost:8081/api/users")
public interface UserServiceClient 
{
	@GetMapping("/getUserOrders/{id}")
	Order usersOrders(@PathVariable Long id);
	
	

}
