package com.tutorialSpring.AprendendoSpring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorialSpring.AprendendoSpring.entities.Order;
import com.tutorialSpring.AprendendoSpring.services.OrderService;

@RestController
@RequestMapping(value = "/orders") //rota web
public class OrderResource {
	
	@Autowired
	private OrderService ser;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> obj = ser.findAll();
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping(value = "/{id}") //buscar por ID, ID sendo parametro da url
	public ResponseEntity<Order> findById(@PathVariable long id){
		Order obj = ser.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
