package com.rentavehicle.demo.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rentavehicle.demo.model.User;
import com.rentavehicle.demo.model.Vehicle;
import com.rentavehicle.demo.model.VehicleUser;
import com.rentavehicle.demo.service.UserService;
import com.rentavehicle.demo.service.VehicleService;
import com.rentavehicle.demo.service.VehicleUserService;

//Use ArrayList, How to send Json responses,use java 8 lambda and use arraylist


@RestController
@RequestMapping("/user")
public class UserController {
	
	
	
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private VehicleService vehicleService;
	
	@Autowired 
	private VehicleUserService vehicleUserService;
	
	
	
	//@PostMapping("/save")
	@RequestMapping(method = RequestMethod.POST,value ="/newuser")
	public ResponseEntity<User> saveNewUser(@RequestBody User user,HttpServletRequest request) {
		User createdUser=userService.saveNewUser(user);
		return ResponseEntity.ok().body(createdUser);
	}
	
	
	
	@PostMapping("/get/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") Integer id){
		System.out.println(id);
		
		User user = userService.getUserById(id);
		userService.getUserById(id);
		
		System.out.println(user);
		
		return ResponseEntity.ok().body(user);
	}
	

	@PutMapping("/updateuser/{uid}")
	public User updateUserById(@PathVariable("uid") Integer id,@RequestBody User user){
		User userUpdate = userService.getUserById(id);
		user.setUid(id);
		/*
		userUpdate.setUsername(user.getUsername());
		userUpdate.setAddress(user.getAddress());
		userUpdate.setMobNumber(user.getMobNumber());
		
		User user2 = userService.saveNewUser(userUpdate);
		return ResponseEntity.ok().body(user2);
		*/
		
		
		return userService.updateUser(id,user);
	}
	
	
	
	
	@DeleteMapping("/deleteuser/{uid}")
	public Map<String, String>deleteUserByTheirId(@PathVariable("uid") Integer id){
	
		User user = userService.getUserById(id);
		if(user!=null) {
			userService.deleteUser(id);
			
	
			return Collections.singletonMap("success", "Record Deleted Successfully");
		}
		 else {
			return Collections.singletonMap("fail", "Something is wrong");
		}
		
		
	
			
			
			
			
			
		}
		
		
		

	
	/*
	@GetMapping("/user/getvehicletest")
	
	public void List<String> getVehicleslist(){
		List vehicleList=new ArrayList<>();
		vehicleList.add("Jauguar");
		vehicleList.add("Oddi");
		vehicleList.add("BMW");
		
	}
	*/
	
	@RequestMapping(method = RequestMethod.POST,value ="/rentvehicle")
	public ResponseEntity<Map<User, Vehicle>> userRentVehicle(@RequestBody VehicleUser vehicleuser){
			/*
		for (Vehicle vehicle  : vehicleService.getAllVehicles()) {
			System.out.println(vehicle.getVname().toString());
			System.out.println(vehicle.getVid());			
		}*/
		
		Map<User,Vehicle> userrentsVehicle = new HashMap<>(); //Means we can apply joins and all to get appropriate data//  Before it was Like Map<User,Vehicle>
		
//		userrentsVehicle.put(userService.getUser(user.getUid(3)),vehicleService.getVehicleById(vehicle.getVid(1)));
		userrentsVehicle.put(userService.getUserById((vehicleuser.getUid())),vehicleService.getVehicleById((vehicleuser.getVid())));
		
		vehicleUserService.rentNewVehicle(vehicleuser);
		
		//System.out.println(userrentsVehicle);
	
		return ResponseEntity.ok().body(userrentsVehicle);
		
	}
	 



}