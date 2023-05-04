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
import com.example.bank.Repository.AccountRepo;
import com.example.bank.Service.AccountService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	AccountService aser;
	
	@Autowired
	AccountRepo arepo;
	
	@Tag(name = "CRUD OPERATION FOR ACCOUNT",description = "save the details in database")
	@PostMapping("")
	public Account saveDetails(@RequestBody Account as)
	{
		return aser.saveDetails(as);
	}
	
	@Tag(name = "CRUD OPERATION FOR ACCOUNT",description = "provides all the account details ")
	@GetMapping("")
	public List<Account> getDetails()
	{
		return aser.getDetails();
	}
	
	@Tag(name = "CRUD OPERATION FOR ACCOUNT",description = "update the account details")
	@PutMapping("")
	public Account updateDetails(@RequestBody Account aup)
	{
		return aser.updateDetails(aup);
	}
	
	@Tag(name = "CRUD OPERATION FOR ACCOUNT",description = "deletes  the  account details of given id")
	@DeleteMapping("/{id}")
	public String  deleteDetails(@PathVariable int id)
	{
		aser.deleteDetails(id);
		return "Deleted";
	}
	
	@Tag(name = "NATIVE QUERY FOR ACCOUNT",description = "provides all the account details ")
	@GetMapping("/getallac")
	public List<Account> getall()
	{
		return aser.getAllData();
	}
	
	@Tag(name = "NATIVE QUERY FOR ACCOUNT",description = "provides the requested account detail")
	@GetMapping("/getbybid/{id}")
	public List<Account> getbyid(@PathVariable int id)
	{
		return aser.getbyid(id);
	}
	
	@Tag(name = "NATIVE QUERY FOR ACCOUNT",description = "provides all the account details between given ids")
	@GetMapping("/getacbybetween/{start}/{end}")
	public List<Account> getbybetween(@PathVariable int start,@PathVariable int end)
	{
		return aser.between(start, end);
	}
	
	@Tag(name = "NATIVE QUERY FOR ACCOUNT",description = "delete the account details ")
	@DeleteMapping("/bybidname/{id}/{name}")
	public String deletebyid(@PathVariable int id,@PathVariable String name)
	{
		aser.deletebyidname(id, name);
		return "Deleted";
	}
	
	@Tag(name = "NATIVE QUERY FOR ACCOUNT",description = "update the account details using query")
	@PutMapping("/putbybidname/{id}/{name}")
	public void updatebyidname(@PathVariable int id,@PathVariable String name)
	{
		 aser.updatebyidname(id, name);
	}
	
	//JPQL
		@Tag(name = "JPQL FOR ACCOUNT",description = "get account details by bname")
		@GetMapping("/getbyjpql/{bname}")
		public List<Account> getJPQLbname(@PathVariable String bname)
		{
			return arepo.getbybnamej(bname);
		}
		
		@Tag(name = "JPQL FOR ACCOUNT",description = "get account details between bid s ")
		@GetMapping("/jpqlbetween/{start}/{end}")
		public List<Account> jpqlbetween(@PathVariable int start,@PathVariable int end)
		{
			return arepo.betweenj(start, end);
		}
		
		@Tag(name = "JPQL FOR ACCOUNT",description = "get account details using like keyword")
		@GetMapping("/jpqllike")
		public List<Account> jpqllike()
		{
			return arepo.likej();
		}
		
		@Tag(name = "JPQL FOR ACCOUNT",description = "update bname by using bid")
		@PutMapping("/jpqlupdate/{bname}/{id}")
		public String updateDetails(@PathVariable String bname,@PathVariable int id)
		{
			arepo.updatej(bname, id);
			return "Updated";
		}
		
		@Tag(name = "JPQL FOR ACCOUNT",description = "delete account detail by using bid")
		@DeleteMapping("/jpqldelete/{bid}")
		public String deletejp(@PathVariable int bid)
		{
			arepo.deletej(bid);
			return "Account deleted Successfully";
		}
		
}
