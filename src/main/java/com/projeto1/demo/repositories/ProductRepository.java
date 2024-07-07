package com.projeto1.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto1.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
