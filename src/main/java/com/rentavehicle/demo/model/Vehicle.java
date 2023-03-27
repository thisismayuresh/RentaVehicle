package com.rentavehicle.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Vehicles")
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "vid")
	Integer id;
	
	@Column(name = "vehiclename")
	String vehicleName;
	
	@Column(name = "vehicletype")
	String vehicleType;
	
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", vehicleName=" + vehicleName + ", vehicleType=" + vehicleType + "]";
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public int getVid() {
		return id;
	}
	public void setVid(int id) {
		this.id = id;
	}
	public String getVname() {
		return vehicleName;
	}
	public void setVname(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	}
	
	
