package com.rentavehicle.demo.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import javax.management.loading.PrivateClassLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rentavehicle.demo.model.User;
import com.rentavehicle.demo.model.Vehicle;
import com.rentavehicle.demo.model.VehicleUser;
import com.rentavehicle.demo.repository.UserRepository;
import com.rentavehicle.demo.repository.VehicleRepository;
import com.rentavehicle.demo.repository.VehicleUserRepository;
import com.rentavehicle.demo.service.VehicleUserService;



@Service
public class VehicleUserImpl implements VehicleUserService{

	@Autowired
	private VehicleUserRepository vehicleUserRepository;
	
	@Autowired 
	private UserRepository userRepository;
	
	@Autowired
	private VehicleRepository vehicleRepository;
	
	@Autowired
	private VehicleUserService vehicleUserService;
	
	
	@Override
	public Map<Vehicle, User> rentNewVehicle(VehicleUser vehicleUser) {
		// TODO Auto-generated method stub
			
			Map<Vehicle, User> uidvid = new HashMap<>();
			
			vehicleUserRepository.save(vehicleUser);
		
			Vehicle vehicle = vehicleRepository.findById(vehicleUser.getUid());
			User user = userRepository.findByUid((vehicleUser.getUid()));		
			
			uidvid.put(vehicle, user);
			return uidvid;
			
			
		 
		}


	

//
//	@Override
//	public VehicleUser fetchVehicleByUserName(String name) { //who has rentented which vehicle
//		
//		return userRepository.fetchVehicleByUsername(name);
//	}
			
				
	}
	


