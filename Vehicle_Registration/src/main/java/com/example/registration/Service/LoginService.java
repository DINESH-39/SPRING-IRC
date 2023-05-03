package com.example.registration.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.registration.Model.LoginModel;
import com.example.registration.Repository.LoginRepo;

@Service
public class LoginService {

	@Autowired
	private LoginRepo lrepo;
	
	
	public String validateUser(String username,String password)
	{
		LoginModel v=lrepo.findByusername(username);
		if(v==null)
		{
			return "Invalid User";
		}
		else
		{
			if(v.getPassword().equals(password))
			{
				return "Login Successful";
			}
			else
			{
				return "Incorrect Password";
			}
		}	
	}
	public LoginModel addUser(LoginModel lm)
	{
		return lrepo.save(lm);
	}
	public List<LoginModel> getData()
	{
		return lrepo.findAll();
	}
	
}
