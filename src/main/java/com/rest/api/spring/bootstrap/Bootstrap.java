package com.rest.api.spring.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rest.api.spring.domain.Category;
import com.rest.api.spring.repositories.CategoryRepository;

@Component
public class Bootstrap implements CommandLineRunner{
	
	CategoryRepository categoryRepository;

	public Bootstrap(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		 Category fruits = new Category();
	        fruits.setName("Fruits");

	        Category dried = new Category();
	        dried.setName("Dried");

	        Category fresh = new Category();
	        fresh.setName("Fresh");

	        Category exotic = new Category();
	        exotic.setName("Exotic");

	        Category nuts = new Category();
	        nuts.setName("Nuts");

	        categoryRepository.save(fruits);
	        categoryRepository.save(dried);
	        categoryRepository.save(fresh);
	        categoryRepository.save(exotic);
	        categoryRepository.save(nuts);


	        System.out.println("Data Loaded = " + categoryRepository.count() );
		
	}
	
	

}
