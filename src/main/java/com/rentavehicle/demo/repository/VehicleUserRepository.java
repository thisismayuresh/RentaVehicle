package com.rentavehicle.demo.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.rentavehicle.demo.model.VehicleUser;

@Repository
public interface VehicleUserRepository extends CrudRepository<VehicleUser, Serializable>{
	
	//here everything autoinjects itself cannot create a methid spring
	//will autoinject something innt
	
	//public VehicleUser findVehicleByVehicleUser(VehicleUser vehicleUser);
	
	

}
