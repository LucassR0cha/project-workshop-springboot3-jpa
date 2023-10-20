package com.protxprts.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.protxprts.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
