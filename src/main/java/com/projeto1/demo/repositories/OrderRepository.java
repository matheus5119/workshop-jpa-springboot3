package com.projeto1.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto1.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
