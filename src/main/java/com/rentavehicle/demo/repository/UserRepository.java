package com.rentavehicle.demo.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rentavehicle.demo.model.User;
import com.rentavehicle.demo.model.VehicleUser;




@Repository
public interface UserRepository extends CrudRepository<User, Serializable> {
	public User findByUid(Integer uid);

	
	//public VehicleUser fetchVehicleByUsername(String name);

	

	

	
	
	
}
