package com.rentavehicle.demo.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rentavehicle.demo.model.User;



public interface UserService {

	public User saveNewUser(User user);
	
	public void deleteUser(Integer id);

	public User getUserById(Integer uid); 

	public User updateUser(Integer id, User user);
	



	
	
	
		
	
}
