package com.example.springrest.SpringRestAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.springrest.SpringRestAPI.dao.UserRepository;
import com.example.springrest.SpringRestAPI.model.User;

@Service
public class UserService {

	@Autowired
	UserRepository userRepo;
public User saveUser(User u)
{
return userRepo.save(u);
}
public String validateUser(String username,String password)
{
	String result="";
	User u=userRepo.findByUsername(username);
	if(u==null)
	{
		result="Invalid user";
	}
		else
		{
			if(u.getPassword().equals(password))
			{
				result="Login success";
			}
			else
			{
				result="Incorrect Password";
			}
		}
	

	return result;
	}

	//sorting
	public List<User> sortDesc(String pname)
	{
		return userRepo.findAll(Sort.by(pname).descending());
	}
	
	//Pagination
	public List<User> paginationData(int pageNu,int pagesize)
	{
		Page<User> p=userRepo.findAll(PageRequest.of(pageNu, pagesize));
		return  p.getContent();
	}

	public List<User> paginationandSorting(int pageNu,int pageSize,String name)
	{
		Page <User> p=userRepo.findAll(PageRequest.of(pageNu, pageSize, Sort.by(name).descending()));
		return p.getContent();
	}
}
