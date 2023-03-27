package com.rentavehicle.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rentavehicle.demo.model.Vehicle;
import com.rentavehicle.demo.service.VehicleService;


@RestController
@RequestMapping("/vehicle")
public class VehicleController {
	

	@Autowired
	private VehicleService vehicleService;
	

	@PostMapping("/savenewvehicle")
	public ResponseEntity<Vehicle> saveVehicle (@RequestBody Vehicle vehicle,HttpServletRequest request){
		Vehicle createdVehicle = vehicleService.saveNewVehicle(vehicle);
		System.out.println(vehicle);
		
		return ResponseEntity.ok().body(createdVehicle);
	}
	
	@GetMapping("/getallvehicles")
	public @ResponseBody Iterable<Vehicle> getAllVehicles(){
		return vehicleService.getAllVehicles();
		
	}
	
	@GetMapping("/getvehicle/{vid}")
	ResponseEntity<Vehicle> getVehicleById(@PathVariable("vid") Integer vid){
		
		Vehicle vehicle = vehicleService.getVehicleById(vid);
		
		return ResponseEntity.ok().body(vehicle);
		
	
	}
	
	

	
	
	

}
