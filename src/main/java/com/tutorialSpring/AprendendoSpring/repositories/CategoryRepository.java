package com.tutorialSpring.AprendendoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorialSpring.AprendendoSpring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
