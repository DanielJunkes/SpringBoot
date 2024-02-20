package com.tutorialSpring.AprendendoSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorialSpring.AprendendoSpring.entities.Product;
import com.tutorialSpring.AprendendoSpring.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository rep;

	public List<Product> findAll() {
		return rep.findAll();
	}

	public Product findById(long id) {
		Optional<Product> obj = rep.findById(id);
		return obj.get();
	}
}
