package com.example.demo.web;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Cars;
import com.example.demo.service.CarsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class CarsController {
	
	private CarsService service;
	@Autowired //tells spring to fetch the PersonService from the context - dependency injection
	public CarsController(CarsService service) {
		this.service=service;
	}
//	@GetMapping("/helloWorld")
//	public String hello() {
//		return "Hullo World";
//	}
	
	@PostMapping("/create")
	public ResponseEntity<Cars> createCar(@RequestBody Cars c) {
		Cars created = this.service.createCars(c);
		ResponseEntity<Cars> response = new ResponseEntity<Cars>(created, HttpStatus.CREATED);
		return response;
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Cars>> getAllCars() {
		return ResponseEntity.ok(this.service.getAllCars());
	}
	
	@GetMapping("/get/{id}")
	public Cars getCar(@PathVariable Integer id) {
		return this.service.getCar(id);
	}
	
	@PutMapping("/replace/{id}")
	public ResponseEntity<Cars> replaceCar(@PathVariable Integer id, @RequestBody Cars newCar) {
		Cars body = this.service.replaceCar(id, newCar);
		ResponseEntity<Cars> response = new ResponseEntity<Cars>(body, HttpStatus.ACCEPTED);
		return response;
	}
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<?> removeCars(@PathVariable Integer id) {
		this.service.removeCars(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
