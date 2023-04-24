package com.example.registration.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
}
