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
import com.example.bank.Repository.CustomerRepo;
import com.example.bank.Service.CustomerService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/details")
public class CustomerController 
{

	@Autowired
	CustomerService cser;
	
	@Autowired
	CustomerRepo crepo;
	
	@Tag(name = "CRUD Operation",description = "Add the details to the database")
	@PostMapping("")
	public Customer saveDetails(@RequestBody Customer cs)
	{
		return cser.saveDetails(cs);
	}
	
	@Tag(name = "CRUD Operation",description = "provides the details in the database")
	@GetMapping("")
	public List<Customer> getDetails()
	{
		return cser.getDetails();
	}
	
	@Tag(name = "CRUD Operation",description = "update the details in the database")
	@PutMapping("")
	public Customer updateDetails(@RequestBody Customer cup)
	{
		return cser.updateDetails(cup);
	}
	
	@Tag(name = "Native Query for Customer",description = "provides all the details")
	@GetMapping("/getall")
	public List<Customer> getall()
	{
		return cser.getAllData();
	}
	
	@Tag(name = "Native Query for Customer",description = "provides the details of table using id")
	@GetMapping("/getbyid/{id}")
	public List<Customer> getbyid(@PathVariable int id)
	{
		return cser.getbyid(id);
	}
	
	@Tag(name = "Native Query for Customer",description = "provides the details between the given ids")
	@GetMapping("/getbybetween/{start}/{end}")
	public List<Customer> getbybetween(@PathVariable int start,@PathVariable int end)
	{
		return cser.between(start, end);
	}
	
	@Tag(name = "Native Query for Customer",description = "update cname by using id")
	@PutMapping("/putbyidname/{name}/{id}")
	public void updatebyidname(@PathVariable String name,@PathVariable int id)
	{
		cser.updatebyidname( name,id);
	}
	//JPQL
	@Tag(name = "JPQL",description = "get customer details by cname")
	@GetMapping("/getbyjpql/{cname}")
	public List<Customer> getJPQLbname(@PathVariable String cname)
	{
		return crepo.getbyjc(cname);
	}
	
	@Tag(name = "JPQL",description = "get customer details between cid s ")
	@GetMapping("/jpqlbetween/{start}/{end}")
	public List<Customer> jpqlbetween(@PathVariable int start,@PathVariable int end)
	{
		return crepo.betweenjc(start, end);
	}
	
	@Tag(name = "JPQL",description = "get customer details using like keyword")
	@GetMapping("/jpqllike")
	public List<Customer> jpqllike()
	{
		return crepo.likejc();
	}
	
	@Tag(name = "JPQL",description = "update cname by using cid")
	@PutMapping("/jpqlupdate/{cname}/{id}")
	public String updateDetails(@PathVariable String cname,@PathVariable int id)
	{
		crepo.updatejc(cname, id);
		return "Updated";
	}
	
	
}
