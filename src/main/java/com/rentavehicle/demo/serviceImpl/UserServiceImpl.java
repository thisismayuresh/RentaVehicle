package com.rentavehicle.demo.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rentavehicle.demo.model.User;
import com.rentavehicle.demo.repository.UserRepository;
import com.rentavehicle.demo.repository.VehicleRepository;
import com.rentavehicle.demo.repository.VehicleUserRepository;
import com.rentavehicle.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	private VehicleRepository vehicleRepository;
	private VehicleUserRepository vehicleUser;

	@Override
	public User saveNewUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(Integer id) {
	userRepository.deleteById(id);
		

	}

	@Override
	public User getUserById(Integer uid) {
		User user = userRepository.findById(uid).get();

		return user;

	}

	@Override
	public User updateUser(Integer id, User user) {

		User userDB = userRepository.findById(id).get();

		if (Objects.nonNull(user.getUsername()) && !"".equalsIgnoreCase(user.getUsername())) {

			userDB.setUsername(user.getUsername());

		}

		if (Objects.nonNull(user.getAddress()) && !"".equalsIgnoreCase(user.getUsername())) {

			userDB.setUsername(user.getAddress());

		}

		if (Objects.nonNull(user.getMobNumber()) && !"".equalsIgnoreCase(user.getUsername())) {

			userDB.setUsername(user.getMobNumber());
		}
		
		return userRepository.save(userDB);

	}

	
	
	
	
}
