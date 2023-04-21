package com.example.database.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.database.Model.CarModel;
import com.example.database.Service.CarService;

@RestController
public class CarController {

	@Autowired
	public CarService cser;
	
	@PostMapping("/savedec")
	public CarModel addDetails(@RequestBody CarModel cr)
	{
		return cser.saveInfo(cr);
	}
	
	
}
