package com.example.bank.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bank.Model.Account;
import com.example.bank.Repository.AccountRepo;

@Service
public class AccountService
{

	@Autowired
	AccountRepo arep;
	
	public Account saveDetails(Account as)
	{
		return arep.save(as);
	}
	
	public List<Account> getDetails()
	{
		return arep.findAll();
	}
	
	public Account updateDetails(Account aup)
	{
		return arep.saveAndFlush(aup);
	}
	
	public void deleteDetails(int id)
	{
		arep.deleteById(id);
	}
	
	public List<Account> getAllData()
	{
		return arep.getAllData();
	}
	
	public List<Account> getbyid(int id)
	{
		return arep.bybid(id);
	}
	
	
	public List<Account> between(int start,int end)
	{
		return arep.startend(start,end);
	}
	
	public void deletebyidname(int id,String name)
	{
		arep.deletebyId(id, name);
	}
	
	public void updatebyidname(int id,String name)
	{
		 arep.updatebyidname(id, name);
	}
	
	
		
		
}
