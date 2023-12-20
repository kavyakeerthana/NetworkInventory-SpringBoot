package com.app.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CustomerDetails")
public class adminentity {
	
	
	
	public adminentity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name="ID")
	public Long Id;
	
	@Column(name="name")
	public String name;
	
	@Column(name="surname")
	public String surname;
	
	@Column(name="DOB")
	public String DOB;
	
	@Column(name="gender")
	public String gender;
	
	@Column(name="phone")
	public String phone;
	
	@Column(name="aadhar")
	public String aadhar;
	
	@Column(name="email")
	public String email;
	
	@Column(name="address")
	public String address;
	
	@Column(name="country")
	public String country;
	
	@Column(name="state")
	public String state;
	
	@Column(name="connectionType")
	public String connectionType;
	
	@Column(name="connectionPlan")
	public String connectionPlan;
	
	@Column(name="speed")
	public String speed;
	
	@Column(name="data")
	public String data;
	
	@Column(name="rent")
	public String rent;
	
	

	public adminentity(String name, String surname, String dOB, String gender, String phone, String aadhar,
			String email, String address, String country, String state, String connectionType, String connectionPlan,
			String speed, String data, String rent) {
		super();
		this.name = name;
		this.surname = surname;
		DOB = dOB;
		this.gender = gender;
		this.phone = phone;
		this.aadhar = aadhar;
		this.email = email;
		this.address = address;
		this.country = country;
		this.state = state;
		this.connectionType = connectionType;
		this.connectionPlan = connectionPlan;
		this.speed = speed;
		this.data = data;
		this.rent = rent;
	}
	
	

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getConnectionType() {
		return connectionType;
	}

	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}

	public String getConnectionPlan() {
		return connectionPlan;
	}

	public void setConnectionPlan(String connectionPlan) {
		this.connectionPlan = connectionPlan;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getRent() {
		return rent;
	}

	public void setRent(String rent) {
		this.rent = rent;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
