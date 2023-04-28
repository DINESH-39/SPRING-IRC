package com.example.registration.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.registration.Model.VehicleModel;
import com.example.registration.Service.VehicleService;

@RestController
public class VehicleController {

	@Autowired
	public VehicleService vser;
	
	@PostMapping("/postvhcl")
	public VehicleModel addInfo(@RequestBody VehicleModel vp)
	{
		return vser.saveInfo(vp);
	}
	
	@GetMapping("/getvhcl")
	public List<VehicleModel> getDetails()
	{
		return vser.getInfo();
	}
	
	
	@PutMapping("/updatevhcl")
	public VehicleModel updateInfo(@RequestBody VehicleModel vu)
	{
		return vser.updateInfo(vu);
	}
	
	@DeleteMapping("/deletevhcl/{regno}")
	public String deleteInfo(@PathVariable String regno)
	{
		vser.deleteInfo(regno);
		return "Reg.number "+regno+" is deleted";
	}
	
	@DeleteMapping("/delete")
	public String deletebyreq(@RequestParam String regno)
	{
		vser.deleteInfo(regno);
		return "Reg.number "+regno+" is deleted";
	}
	
}