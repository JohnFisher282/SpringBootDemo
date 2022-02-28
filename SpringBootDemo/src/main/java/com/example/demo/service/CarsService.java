package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.domain.Cars;

@Service
public class CarsService {

	private List<Cars> car = new ArrayList<>();
	
	public Cars createCars(Cars c) {
		this.car.add(c);
		Cars created = this.car.get(this.car.size() - 1);
		return created;
	}
	
	public List<Cars> getAllCars(){
		return this.car;
	}
	public Cars getCar(Integer id) {
		return this.car.get(id);
	}
	public Cars replaceCar(Integer id, Cars newCar){	
		Cars body = this.car.set(id, newCar);
		return body;
	}
	public void removeCars(@PathVariable Integer id) {
		this.car.remove(id.intValue());
	}
}
		

