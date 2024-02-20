package com.tutorialSpring.AprendendoSpring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorialSpring.AprendendoSpring.entities.Product;
import com.tutorialSpring.AprendendoSpring.services.ProductService;

@RestController
@RequestMapping(value = "/products") //rota web
public class ProductResource {
	
	@Autowired
	private ProductService ser;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> obj = ser.findAll();
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping(value = "/{id}") //buscar por ID, ID sendo parametro da url
	public ResponseEntity<Product> findById(@PathVariable long id){
		Product obj = ser.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
