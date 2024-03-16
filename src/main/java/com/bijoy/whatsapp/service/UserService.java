package com.bijoy.whatsapp.service;

import java.util.List;

import com.bijoy.whatsapp.dto.UserDto;
import com.bijoy.whatsapp.exception.UserException;
import com.bijoy.whatsapp.modal.User;
import com.bijoy.whatsapp.request.UpdateUserRequest;

public interface UserService {
	
	public User findUserProfile(String jwt);
	
	public User updateUser(Integer userId, UpdateUserRequest req) throws UserException;
	
	public User findUserById(Integer userId) throws UserException;
	
	public List<User> searchUser(String query);
}
