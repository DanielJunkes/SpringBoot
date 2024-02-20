package com.tutorialSpring.AprendendoSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorialSpring.AprendendoSpring.entities.Category;
import com.tutorialSpring.AprendendoSpring.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository rep;

	public List<Category> findAll() {
		return rep.findAll();
	}

	public Category findById(long id) {
		Optional<Category> obj = rep.findById(id);
		return obj.get();
	}
}
