package com.tutorialSpring.AprendendoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorialSpring.AprendendoSpring.entities.OrderItem;
import com.tutorialSpring.AprendendoSpring.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
}
