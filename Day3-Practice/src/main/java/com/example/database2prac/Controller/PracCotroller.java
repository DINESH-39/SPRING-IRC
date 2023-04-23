package com.example.database2prac.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.database2prac.Eg.Main;
import com.example.database2prac.Service.PracService;

@RestController
public class PracCotroller {
	
	@Autowired
	public PracService pser;
	@PostMapping("/prc")
	public Main addDetails(@RequestBody Main m2)
	{
		return pser.saveInfo(m2);
	}

}
