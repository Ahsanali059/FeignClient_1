package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.User;
import com.example.demo.respositories.userRepository;

@Service
public class userService 
{
	@Autowired
	private userRepository userRepository;
	
	
	public void getUser(Long id)
	{
		userRepository.findById(id);
		
		
	}

}
