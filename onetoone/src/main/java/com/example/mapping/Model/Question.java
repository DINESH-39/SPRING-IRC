package com.example.mapping.Model;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Question 
{

	@Id
	private int qno;
	private String qname;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn
	private Answer ans;

	public int getQno() {
		return qno;
	}

	public void setQno(int qno) {
		this.qno = qno;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public Answer getAns() {
		return ans;
	}

	public void setAns(Answer ans) {
		this.ans = ans;
	}

	
	
	
	
}
