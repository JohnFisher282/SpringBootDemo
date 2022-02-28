package com.example.demo.domain;

public class Cars {
	
	private int id;
	private String make;
	private String model;
	private String registration;
	private Integer yearOfManufacture;
	
	public Cars() {
		super();
	}
	public Cars(Integer id, String make, String model, String registration, Integer yearOfManufacture) {
		super();
		this.id = id;
		this.make = make;
		this.model = model;
		this.registration = registration;
		this.yearOfManufacture = yearOfManufacture;
	}
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getRegistration() {
		return registration;
	}
	public void setRegistration(String registration) {
		this.registration = registration;
	}
	public int getYearOfManufacture() {
		return yearOfManufacture;
	}
	public void setYearOfManufacture(Integer yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
	@Override
	public String toString() {
		return "Cars [id=" + id + ", make=" + make + ", model=" + model + ", registration=" + registration
				+ ", yearOfManufacture=" + yearOfManufacture + "]";
	}
	
	
	
	
}
