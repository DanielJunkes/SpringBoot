package com.tutorialSpring.AprendendoSpring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorialSpring.AprendendoSpring.entities.User;

@RestController
@RequestMapping(value = "/users") //rota web
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User u = new User(1L, "Daniel", "daniel@gmail.com", "1234-4321", "12345");
		
		return ResponseEntity.ok(u);
		
	}
	
}
