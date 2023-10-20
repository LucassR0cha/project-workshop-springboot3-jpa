package com.protxprts.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.protxprts.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
