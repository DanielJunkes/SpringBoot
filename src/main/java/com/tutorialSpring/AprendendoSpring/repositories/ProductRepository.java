package com.tutorialSpring.AprendendoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorialSpring.AprendendoSpring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
