package com.example.registration.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.registration.Model.LoginModel;


public interface LoginRepo extends JpaRepository<LoginModel, Integer> {
	
	 LoginModel findbyusername(String username);
}
