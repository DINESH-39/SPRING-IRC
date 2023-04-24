package com.example.connection.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.connection.Model.IPLModel;

public interface IPLRepo extends JpaRepository<IPLModel,Integer> {

}
