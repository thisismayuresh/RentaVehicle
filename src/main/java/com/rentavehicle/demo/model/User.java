package com.rentavehicle.demo.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")

public class User {
	
	@Id
	@Column(name = "uid")
	@GeneratedValue(strategy  = GenerationType.AUTO)
	Integer uid;
	
	/*
	public User(Integer uid, String username, String address, String mobNumber) {
		this.uid = uid;
		this.username = username;
		this.address = address;
		this.mobNumber = mobNumber;
	}
	*/


	@Column(name = "username")
	String username;
	
	@Column(name = "address")
	String address;
	
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", address=" + address + ", mobNumber=" + mobNumber
				+ "]";
	}

	@Column(name = "phonenumber")
	String mobNumber;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobNumber() {
		return mobNumber;
	}

	public void setMobNumber(String mobNumber) {
		this.mobNumber = mobNumber;
	}

}
