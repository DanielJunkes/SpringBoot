package com.tutorialSpring.AprendendoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorialSpring.AprendendoSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
