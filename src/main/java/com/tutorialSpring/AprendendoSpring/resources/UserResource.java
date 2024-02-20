package com.tutorialSpring.AprendendoSpring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorialSpring.AprendendoSpring.entities.User;
import com.tutorialSpring.AprendendoSpring.services.UserService;

@RestController
@RequestMapping(value = "/users") //rota web
public class UserResource {
	
	@Autowired
	private UserService userSer;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> users = userSer.findAll();
		return ResponseEntity.ok().body(users);
	}
	
	@GetMapping(value = "/{id}") //buscar por ID, ID sendo parametro da url
	public ResponseEntity<User> findById(@PathVariable long id){
		User user = userSer.findById(id);
		return ResponseEntity.ok().body(user);
	}
}
