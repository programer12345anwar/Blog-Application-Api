package com.anwar.blog.services;

import java.util.List;

import com.anwar.blog.payloads.UserDto;
import com.anwar.blog.entities.User;

public interface UserService {
	UserDto createUser(UserDto user);
	UserDto updateUser(UserDto user,Integer userId);
	UserDto getUserById(Integer userId);
	List<UserDto> getAllUsers();
	void deleteUser(Integer userId);
}
