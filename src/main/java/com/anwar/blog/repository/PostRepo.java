package com.anwar.blog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anwar.blog.entities.Category;
import com.anwar.blog.entities.Post;
import com.anwar.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer>{
	
	
	//findByName-->Name can be anything a/c to requirement,=> search findBy methods in jpa
	List<Post> findByUser(User user);//custom method to get all post of the particular user
	List<Post> findByCategory(Category category);//custom method to get all posts of that category
	
}
