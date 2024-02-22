package com.tutorialSpring.AprendendoSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorialSpring.AprendendoSpring.entities.User;
import com.tutorialSpring.AprendendoSpring.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository rep;
	
	public List<User> findAll(){
		return rep.findAll();
	}
	
	public User findById(long id) {
		Optional<User> obj = rep.findById(id);
		return obj.get();
	}
	
	public User Insert(User obj) {
		return rep.save(obj);
	}
	
	public void Delete(long id) {
		rep.deleteById(id);;
	}
	
	public User Update(long id, User obj) {
		User entity = rep.getReferenceById(id);
		updateData(entity, obj);
		return rep.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
