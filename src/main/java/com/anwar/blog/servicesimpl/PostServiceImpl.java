package com.anwar.blog.servicesimpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anwar.blog.entities.Post;
import com.anwar.blog.payloads.PostDto;
import com.anwar.blog.repository.PostRepo;
import com.anwar.blog.services.PostService;


@Service //so that it becomes component of  spring
public class PostServiceImpl implements PostService {
	
	
	//to perform database operation we need postrepo
	@Autowired
	private PostRepo postRepo;
	
	//to convert postdto into post and viceversa
	//for that we will use Model Mapper
	 
	@Autowired
	private ModelMapper modelMapper;

	
	
	
	@Override
	public PostDto createPost(PostDto postDto) {
		 
	Post post=this.modelMapper.map(postDto, Post.class);//postDto have only two fields title and content ,for other we will get from Post so from here i will get the required fields
	post.setImageName("default.png");
	 
		return null;
	}

	@Override
	public Post updatePost(PostDto postDto, Integer postId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePost(Integer postId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Post> getAllPost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post getPostById(Integer postId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> getPostsByCategory(Integer category_Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> getPostsByUser(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> searchPosts(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

}
