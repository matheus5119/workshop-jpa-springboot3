package com.projeto1.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto1.demo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
