package com.example.database.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.database.Model.CarModel;

public interface CarRepository extends JpaRepository<CarModel,Integer> {

}
