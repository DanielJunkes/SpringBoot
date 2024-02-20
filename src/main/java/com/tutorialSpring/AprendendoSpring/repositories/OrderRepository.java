package com.tutorialSpring.AprendendoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorialSpring.AprendendoSpring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
