package com.rentavehicle.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rentavehicle.demo.model.Vehicle;
import com.rentavehicle.demo.repository.VehicleRepository;
import com.rentavehicle.demo.service.VehicleService;




@Service
public class VehicleServiceImpl implements VehicleService {


	
	@Autowired
	private VehicleRepository vehicleRepository;
	
	
	
	@Override
	public Vehicle saveNewVehicle(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return vehicleRepository.save(vehicle);
	}

	@Override
	public Vehicle getVehicleById(Integer id) {
		// TODO Auto-generated method stub
		Vehicle vehicle = vehicleRepository.findById(id);
		
		return vehicle;
	}

	@Override
	public Iterable<Vehicle> getAllVehicles() {
		// TODO Auto-generated method stub
		return vehicleRepository.findAll();
	}

	

	

}
