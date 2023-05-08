package com.example.workshop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.workshop.Model.LoanApplicationModel;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplicationModel, Integer>
{

	
}
