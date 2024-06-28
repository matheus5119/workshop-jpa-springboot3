package com.projeto1.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto1.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
