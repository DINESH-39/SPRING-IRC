package com.example.registration.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.registration.Model.VehicleModel;
import com.example.registration.Repository.VehicleRepo;

@Service
public class VehicleService 
{

	@Autowired
	public VehicleRepo vrep;
	
	public VehicleModel saveInfo(VehicleModel vmod)
	{
		return vrep.save(vmod);
	}
	public VehicleModel updateInfo(VehicleModel vmodl)
	{
		return vrep.saveAndFlush(vmodl);
	}
	public List<VehicleModel> getInfo()
	{
		return vrep.findAll();
	}
	public Optional<VehicleModel> getbyid(int id)
	{
		return vrep.findById(id);
	}
	
	public void deleteInfo(int id)
	{
		vrep.deleteById(id);
	}
	public List<VehicleModel> sortDesc(String name)
	{
		return vrep.findAll(Sort.by(name).descending());
	}
	public List<VehicleModel> sortAsc(String name) {
		return vrep.findAll(Sort.by(name).ascending());
	}
	public List<VehicleModel> paginationData(int pnu,int psize)
	{
		Page <VehicleModel> p=vrep.findAll(PageRequest.of(pnu, psize));
		return p.getContent();
	}
	public List<VehicleModel> pagiationandSorting(int pnu,int psize,String name)
	{
		Page<VehicleModel> p=vrep.findAll(PageRequest.of(pnu, psize, Sort.by(name).descending()));
		return p.getContent();
	}
	public List<VehicleModel> pagiationandSortingAsc(int pnu,int psize,String name)
	{
		Page<VehicleModel> p=vrep.findAll(PageRequest.of(pnu, psize, Sort.by(name).ascending()));
		return p.getContent();
	}
	
	
}
