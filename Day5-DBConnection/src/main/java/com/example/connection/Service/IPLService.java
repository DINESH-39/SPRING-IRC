package com.example.connection.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.connection.Model.IPLModel;
import com.example.connection.Repository.IPLRepo;


@Service
public class IPLService {

	@Autowired
	public IPLRepo irep;
	
	//posting the information
	public IPLModel saveInfo(IPLModel im)
	{
		return irep.save(im);
	}
	
	//getting the information
	public List<IPLModel> getInfo()
	{
		return irep.findAll();
	}
	
	//updating the information
	public IPLModel updateInfo(IPLModel iu)
	{
		return irep.saveAndFlush(iu);
	}
	
	//delete the information
	public void deleteInfo(int id)
	{
		irep.deleteById(id);
	}
	
	//sorting
	public List<IPLModel> sortDesc(String pname)
	{
		return irep.findAll(Sort.by(pname).descending());
	}
	
	//Pagination
	public List<IPLModel> paginationData(int pageNu,int pagesize)
	{
		Page<IPLModel> p=irep.findAll(PageRequest.of(pageNu, pagesize));
		return  p.getContent();
	}
	
	//Pagination and Sorting 
	public List<IPLModel> paginationandSorting(int pageNu,int pageSize,String pname)
	{
		Page <IPLModel> p=irep.findAll(PageRequest.of(pageNu, pageSize, Sort.by(pname).descending()));
		return p.getContent();
	}
}
