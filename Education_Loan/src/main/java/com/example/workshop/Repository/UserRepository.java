package com.example.workshop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.workshop.Model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer> 
{

	UserModel findByEmail(String email);

}
