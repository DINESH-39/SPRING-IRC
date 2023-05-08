package com.example.workshop.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.workshop.Model.LoanApplicationModel;
import com.example.workshop.Model.UserModel;
import com.example.workshop.Repository.LoanApplicationRepository;
import com.example.workshop.Repository.UserRepository;

@Service
public class UserService 
{

	@Autowired
	UserRepository userRep;
	@Autowired
	LoanApplicationRepository laRep;
	public UserModel saveUser(UserModel l)
	{
		return userRep.save(l);
	}
	public String valideteUser(String email,String password)
	{
		String result=" ";
		UserModel l=userRep.findByEmail(email);
		if(l==null)
		{
			result="User not found";
		}
		else
		{
			if(l.getPassword().equals(password))
			{
				result="Login success";
			}
			else
			{
				result="Login failed";
			}
		}
		return result;
	}
	public List<UserModel> get()
	{
		List<UserModel> gm=userRep.findAll();
		return gm;
	}
	
	public LoanApplicationModel getById(int id)
	{
		LoanApplicationModel gi=laRep.findById(id).get();
		return gi;
	}
	public void deleteid(int id) 
	{
		
		userRep.deleteById(id);
	}
	public UserModel update(UserModel pu) 
	{
		return userRep.saveAndFlush(pu);
	}

	
}
