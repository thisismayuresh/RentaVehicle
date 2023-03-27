package com.rentavehicle.demo.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.rentavehicle.demo.model.User;
import com.rentavehicle.demo.model.Vehicle;
import com.rentavehicle.demo.model.VehicleUser;


public interface VehicleUserService {
	
	
	public Map<Vehicle, User> rentNewVehicle(VehicleUser vehicleUser);


	
}

