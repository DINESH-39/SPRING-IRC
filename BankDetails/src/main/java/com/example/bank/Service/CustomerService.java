package com.example.bank.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bank.Model.Customer;
import com.example.bank.Repository.CustomerRepo;

@Service
public class CustomerService 
{

	@Autowired
	CustomerRepo crep;
	
	public Customer saveDetails(Customer cs)
	{
		return crep.save(cs);
	}
	
	public List<Customer> getDetails()
	{
		return crep.findAll();
	}
	
	public Customer updateDetails(Customer cup)
	{
		return crep.saveAndFlush(cup);
	}
	
	public List<Customer> getAllData()
	{
		return crep.getAllData();
	}
	
	public List<Customer> getbyid(int id)
	{
		return crep.bycid(id);
	}
	
	
	public List<Customer> between(int start,int end)
	{
		return crep.startend(start,end);
	}
	
	public void updatebyidname(String name,int id)
	{
		 crep.updatebyidname(name, id);
	}
}
