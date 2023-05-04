package com.example.bank.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bank.Model.Account;
import com.example.bank.Service.AccountService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	AccountService aser;
	
	@Tag(name = "ADD ACCOUNT DETAILS IN ONE TO MANY PROJECT",description = "save the details in database")
	@PostMapping("")
	public Account saveDetails(@RequestBody Account as)
	{
		return aser.saveDetails(as);
	}
	
	@Tag(name = "GET ALL ACCOUNT DETAILS ",description = "provides all the account details ")
	@GetMapping("")
	public List<Account> getDetails()
	{
		return aser.getDetails();
	}
	
	@Tag(name = "UPDATE ACCOUNT DETAILS ",description = "update the account details")
	@PutMapping("")
	public Account updateDetails(@RequestBody Account aup)
	{
		return aser.updateDetails(aup);
	}
	
	@Tag(name = "DELETE ACCOUNT DETAILS IN ONE TO MANY PROJECT",description = "deletes  the  account details of given id")
	@DeleteMapping("/{id}")
	public String  deleteDetails(@PathVariable int id)
	{
		aser.deleteDetails(id);
		return "Deleted";
	}
	
	@Tag(name = "GET ALL ACCOUNT DETAILS USING QUERY",description = "provides all the account details ")
	@GetMapping("/getallac")
	public List<Account> getall()
	{
		return aser.getAllData();
	}
	
	@Tag(name = "GET  ACCOUNT DETAILS BY ID USING QUERY",description = "provides the requested account details ")
	@GetMapping("/getbybid/{id}")
	public List<Account> getbyid(@PathVariable int id)
	{
		return aser.getbyid(id);
	}
	
	@Tag(name = "GET ALL ACCOUNT DETAILS USING BETWEEN QUERY",description = "provides all the account details between given ids")
	@GetMapping("/getacbybetween/{start}/{end}")
	public List<Account> getbybetween(@PathVariable int start,@PathVariable int end)
	{
		return aser.between(start, end);
	}
	
	@Tag(name = "DELETE ACCOUNT DETAILS USING QUERY",description = "delete the account details ")
	@DeleteMapping("/bybidname/{id}/{name}")
	public String deletebyid(@PathVariable int id,@PathVariable String name)
	{
		aser.deletebyidname(id, name);
		return "Deleted";
	}
	
	@Tag(name = "UPDATE ACCOUNT DETAILS USING QUERY",description = "update the account details using query")
	@PutMapping("/putbybidname/{id}/{name}")
	public void updatebyidname(@PathVariable int id,@PathVariable String name)
	{
		 aser.updatebyidname(id, name);
	}
}
