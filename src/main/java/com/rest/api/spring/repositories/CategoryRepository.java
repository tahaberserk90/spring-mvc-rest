package com.rest.api.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.api.spring.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	Category findByName(String name);
}
