package com.example.workshop.Controller;

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

import com.example.workshop.Model.LoanApplicationModel;
import com.example.workshop.Service.LoanApplicationService;

@RestController
@RequestMapping("/loan")
public class LoanApplicationController {

	@Autowired
	LoanApplicationService laSer;
	
	@GetMapping(value="/getAllLoans")
	public List<LoanApplicationModel> get()
	{
		List<LoanApplicationModel> l=laSer.get();
		return l;
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id)
	{
		laSer.deleteid(id);
		return "Deleted";
	}
	
	@PutMapping("/put")
	public LoanApplicationModel update(@RequestBody LoanApplicationModel pu)
	{
		return laSer.update(pu);
	}
	
	@PostMapping("/add")
	public LoanApplicationModel save(@RequestBody LoanApplicationModel ls)
	{
		return laSer.saveUser(ls);
	}
}
