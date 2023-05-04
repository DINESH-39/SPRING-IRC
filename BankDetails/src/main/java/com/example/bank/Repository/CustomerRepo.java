package com.example.bank.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.bank.Model.Customer;

import jakarta.transaction.Transactional;

public interface CustomerRepo extends JpaRepository<Customer, Integer> 
{

	public List<Customer> findBycname(String cname);
	
	@Query(value = "select * from Customer",nativeQuery = true)
	public List<Customer> getAllData();
	
	@Query(value = "select * from customer where cid=:id",nativeQuery = true)
	public List<Customer> bycid(@Param("id") int id);
	
	@Query(value="select * from customer where cid between :start and :end",nativeQuery=true)
	public List<Customer> startend(@Param("start") int start,@Param("end") int end);
	
	
	
	@Modifying
	@Transactional
	@Query(value = "update customer set cname=:name where cid=:id",nativeQuery = true)
	public void updatebyidname(@Param("name") String name,@Param("id") int id);
	
}
