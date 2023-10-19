package com.protxprts.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.protxprts.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
