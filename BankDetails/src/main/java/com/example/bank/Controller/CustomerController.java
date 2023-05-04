package com.example.bank.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bank.Model.Customer;
import com.example.bank.Service.CustomerService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/details")
public class CustomerController 
{

	@Autowired
	CustomerService cser;
	
	@Tag(name = "Add Customer Details In The ONE TO MANY PROJECT",description = "Add the details to the database")
	@PostMapping("")
	public Customer saveDetails(@RequestBody Customer cs)
	{
		return cser.saveDetails(cs);
	}
	
	@Tag(name = "GET ALL  CUSTOMER DETAILS IN THE ONE TO MANY PROJECT",description = "provides the details in the database")
	@GetMapping("")
	public List<Customer> getDetails()
	{
		return cser.getDetails();
	}
	
	@Tag(name = "UPDATE CUSTOMER DETAILS IN THE ONE TO MANY PROJECT",description = "update the details in the database")
	@PutMapping("")
	public Customer updateDetails(@RequestBody Customer cup)
	{
		return cser.updateDetails(cup);
	}
	
	@Tag(name = "GET ALL CUSTOMER DETAILS USING QUERY",description = "provides the details of requested table by query")
	@GetMapping("/getall")
	public List<Customer> getall()
	{
		return cser.getAllData();
	}
	
	@Tag(name = "GET CUSTOMER DETAILS BY ID USING QUERY",description = "provides the details of requested table using id")
	@GetMapping("/getbyid/{id}")
	public List<Customer> getbyid(@PathVariable int id)
	{
		return cser.getbyid(id);
	}
	
	@Tag(name = "GET CUSTOMER DETAILS USING BETWEEN QUERY ",description = "provides the details of requested table between the given ids using query")
	@GetMapping("/getbybetween/{start}/{end}")
	public List<Customer> getbybetween(@PathVariable int start,@PathVariable int end)
	{
		return cser.between(start, end);
	}
	
	@Tag(name = "UPDATE CUSTOMER DETAILS USING QUERY",description = "update the details of requested table using query")
	@PutMapping("/putbyidname/{name}/{id}")
	public void updatebyidname(@PathVariable String name,@PathVariable int id)
	{
		cser.updatebyidname( name,id);
	}
	
}
