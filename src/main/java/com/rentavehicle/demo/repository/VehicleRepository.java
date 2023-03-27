package com.rentavehicle.demo.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rentavehicle.demo.model.Vehicle;
import com.rentavehicle.demo.model.VehicleUser;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, Serializable>{

	public Vehicle findById(Integer id);
	
	//public VehicleUser fetchVehicleUserByuserame(String name);

	
	
}
