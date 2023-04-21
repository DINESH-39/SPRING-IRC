package com.example.database.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.database.Model.CarModel;
import com.example.database.Repository.CarRepository;

@Service
public class CarService {

	@Autowired
	public CarRepository cser;
	public CarModel saveInfo(CarModel ex)
	{
		return cser.save(ex);
	}
}
