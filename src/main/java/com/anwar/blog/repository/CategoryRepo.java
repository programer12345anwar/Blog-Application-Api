package com.anwar.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anwar.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{
	
	
}
