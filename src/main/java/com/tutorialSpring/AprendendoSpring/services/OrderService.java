package com.tutorialSpring.AprendendoSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorialSpring.AprendendoSpring.entities.Order;
import com.tutorialSpring.AprendendoSpring.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository rep;

	public List<Order> findAll() {
		return rep.findAll();
	}

	public Order findById(long id) {
		Optional<Order> obj = rep.findById(id);
		return obj.get();
	}
}
