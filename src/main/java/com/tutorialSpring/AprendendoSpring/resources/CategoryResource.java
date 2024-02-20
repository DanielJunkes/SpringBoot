package com.tutorialSpring.AprendendoSpring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorialSpring.AprendendoSpring.entities.Category;
import com.tutorialSpring.AprendendoSpring.services.CategoryService;

@RestController
@RequestMapping(value = "/categorys") //rota web
public class CategoryResource {
	
	@Autowired
	private CategoryService ser;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> obj = ser.findAll();
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping(value = "/{id}") //buscar por ID, ID sendo parametro da url
	public ResponseEntity<Category> findById(@PathVariable long id){
		Category obj = ser.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
