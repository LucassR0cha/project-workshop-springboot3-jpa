package com.protxprts.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.protxprts.demo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
