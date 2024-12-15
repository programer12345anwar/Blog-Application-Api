package com.anwar.blog.services;

import java.util.List;

import com.anwar.blog.payloads.CategoryDto;

public interface CategoryService {
	//interface provides 100% abstraction,abstract class can contain 
	//abstract and non abstract method as well
	//create
	  CategoryDto createCategory(CategoryDto categoryDto);
	//update
	  CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);
	//delete
	  void deleteCategory(Integer categoryId);
	//get
	  CategoryDto getCategory(Integer categoryId);
	//get All
	  List<CategoryDto> getCategories();
	  
	  //inside interface every method is by default public or abstract 
	  //so you don't need to write public before return type
	  //why we are using interface here?
	  //for loose coupling ,whenever we need we can change the 
	  //implementation
}
