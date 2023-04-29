package com.example.registration.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.example.registration.Model.VehicleModel;
import com.example.registration.Repository.VehicleRepo;

@Service
public class VehicleService {

	@Autowired
	public VehicleRepo vrep;
	
	
	public VehicleModel saveInfo(VehicleModel vmod)
	{
		return vrep.save(vmod);
	}
	
	public List<VehicleModel> getInfo()
	{
		return vrep.findAll();
	}
	
	public VehicleModel updateInfo(VehicleModel vmodl)
	{
		return vrep.saveAndFlush(vmodl);
	}
	
	public  void  deleteInfo(String regno)
	{
		vrep.deleteById(regno);
	}
	
	
	public List<VehicleModel> sortDesc(String name)
	{
		return vrep.findAll(Sort.by(name).descending());
	}
	
	public List<VehicleModel> paginationData(int pageNu,int pagesize)
	{
		Page<VehicleModel> p=vrep.findAll(PageRequest.of(pageNu, pagesize));
		return  p.getContent();
	}
	public List<VehicleModel> paginationandSorting(int pageNu,int pageSize,String name)
	{
		Page <VehicleModel> p=vrep.findAll(PageRequest.of(pageNu, pageSize, Sort.by(name).descending()));
		return p.getContent();
	}
	
	
}