package com.example.mapping.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapping.Model.Question;
import com.example.mapping.Repository.QuestionRepo;

@RestController
@RequestMapping("/question")
public class QuestionController 
{

	@Autowired
	public QuestionRepo qrepo;
	
	@PostMapping("")
	public String saveDetails(@RequestBody Question q)
	{
		qrepo.save(q);
		return "Saved";
	}
	
	
}
