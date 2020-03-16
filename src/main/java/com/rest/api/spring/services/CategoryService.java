package com.rest.api.spring.services;

import java.util.List;

import com.rest.api.spring.api.v1.model.CategoryDTO;

public interface CategoryService {
	
	List<CategoryDTO> getAllCategories();

    CategoryDTO getCategoryByName(String name);

}
