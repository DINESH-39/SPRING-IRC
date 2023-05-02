package com.example.registration.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.registration.Model.VehicleModel;

public interface VehicleRepo extends JpaRepository<VehicleModel, Integer> {

	

}
