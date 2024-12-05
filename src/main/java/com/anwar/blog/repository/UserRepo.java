package com.anwar.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anwar.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	

}
