package com.anwar.blog.services;

import java.util.List;

import com.anwar.blog.entities.Post;
import com.anwar.blog.payloads.PostDto;

public interface PostService {
	
	//create
	
	PostDto createPost(PostDto postDto);
	
	//update
	
	Post updatePost(PostDto postDto,Integer postId);
	
	//delete
	
	void deletePost(Integer postId);
	
	//get all posts
	
	List<Post> getAllPost();
	
	//get single post
	
	Post getPostById(Integer postId);
	
	//get all posts by category
	
	List<Post> getPostsByCategory(Integer category_Id);
	
	//get all post by user
	
	List<Post> getPostsByUser(Integer userId);
	
	//search posts
	
	List<Post> searchPosts(String keyword);
	
	


}
