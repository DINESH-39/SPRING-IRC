package com.example.workshop.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.workshop.Model.LoanApplicationModel;
import com.example.workshop.Repository.LoanApplicationRepository;

@Service
public class LoanApplicationService 
{

	@Autowired
	LoanApplicationRepository laRep;
	public List<LoanApplicationModel> get()
	{
		List<LoanApplicationModel> l=laRep.findAll();
		return l;
	}
	
	public void deleteid(int id) 
	{
		
		laRep.deleteById(id);
	}
	public LoanApplicationModel update(LoanApplicationModel lmu) 
	{
		return laRep.saveAndFlush(lmu);
	}
	public LoanApplicationModel saveUser(LoanApplicationModel lms)
	{
		return laRep.save(lms);
	}
}
