package com.example.registration.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.registration.Model.*;
import com.example.registration.Service.LoginService;

@RestController
public class LoginController {

	@Autowired
	private LoginService lser;
	@PostMapping("/login")
	public String Login(@RequestBody Map<String, String> LoginModel)
	{
		String username=LoginModel.get("username");
		String password=LoginModel.get("password");
		String result=lser.validateUser(username, password);
		return result;
	}
	
	@PostMapping("/adduser")
	public String addUser(@RequestBody LoginModel lmo)
	{
		lser.addUser(lmo);
		return "Saved"; 
	}
	@GetMapping("/cget")
	public List<LoginModel> listAll()
	{
		return lser.getData();
	}

	
}
