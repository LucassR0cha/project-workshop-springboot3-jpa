package com.protxprts.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.protxprts.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
