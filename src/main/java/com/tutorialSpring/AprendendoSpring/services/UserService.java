package com.tutorialSpring.AprendendoSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.tutorialSpring.AprendendoSpring.entities.User;
import com.tutorialSpring.AprendendoSpring.repositories.UserRepository;
import com.tutorialSpring.AprendendoSpring.services.exceptions.DatabaseException;
import com.tutorialSpring.AprendendoSpring.services.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository rep;

	public List<User> findAll() {
		return rep.findAll();
	}

	public User findById(long id) {
		Optional<User> obj = rep.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public User Insert(User obj) {
		return rep.save(obj);
	}

	public void Delete(long id) {
		try {
	        if(!rep.existsById(id)) {
	        	throw new ResourceNotFoundException(id);
	        }
	        rep.deleteById(id);
		}catch(DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}

	public User Update(long id, User obj) {
		try {
		User entity = rep.getReferenceById(id);
		updateData(entity, obj);
		return rep.save(entity);
		}catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
