package com.rentavehicle.demo.model;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "VehiclesUsers")
@IdClass(VehicleUser.class) 
public class VehicleUser implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	
	@Id
	@Column(name = "uid")
	private Integer uid;
	
	@Id
	@Column(name = "vid")
	private Integer vid;
	
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Integer getVid() {
		return vid;
	}
	public void setVid(Integer vid) {
		this.vid = vid;
	}

}
