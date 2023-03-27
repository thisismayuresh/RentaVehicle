package com.rentavehicle.demo.service;

import org.springframework.stereotype.Service;

import com.rentavehicle.demo.model.Vehicle;



public interface VehicleService {
		
	public Vehicle getVehicleById(Integer id) ;
	
	public Vehicle saveNewVehicle(Vehicle vehicle) ;
	
	public Iterable<Vehicle> getAllVehicles();
	
	
	
	
	

	
		
	
		
	

}


