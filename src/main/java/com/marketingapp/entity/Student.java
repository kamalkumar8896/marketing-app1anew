package com.marketingapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="first_name", length=45,nullable=false)
	
	private String firstName;
	@Column(name="email", length=128,nullable=false,unique=true)
	private String email;
	@Column(name="roll", length=50,nullable=false,unique=true)
	private long roll;
	@Column(name="mobile",nullable=false,unique=true)
	private long mobile;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getRoll() {
		return roll;
	}
	public void setRoll(long roll) {
		this.roll = roll;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	
}
