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
public class VehicleController 
{

	@Autowired
	public VehicleService vser;
	
	@PostMapping("/postvhcl")
	public VehicleModel addInfo(@RequestBody VehicleModel vp)
	{
		return vser.saveInfo(vp);
	}
	@PutMapping("/updatevhcl")
	public VehicleModel updateInfo(@RequestBody VehicleModel up)
	{
		return vser.updateInfo(up);
	}
	@GetMapping("/getvhcl")
	public List<VehicleModel> getInfo()
	{
		return vser.getInfo();
	}
	@DeleteMapping("/deletevhcl/{id}")
	public String deleteInfo(@PathVariable int id)
	{
		vser.deleteInfo(id);
		return "Details deleted for id: "+id;
	}
	@DeleteMapping("dltvhcl")
	public String delete(@RequestParam int id)
	{
		vser.deleteInfo(id);
		return "Deleted";
	}
	@GetMapping("/sortdesc/{name}")
	public List<VehicleModel>  sortVehicle(@PathVariable("name") String name)
	{
		return vser.sortDesc(name);
	}
	@GetMapping("/pagination/{pnu}/{psize}")
	public List<VehicleModel> paginationData(@PathVariable("pnu") int pnu,@PathVariable("psize") int psize)
	{
		return vser.paginationData(pnu, psize);
	}
	@GetMapping("/paginationsorting/{pnu}/{psize}/{name}")
	public List<VehicleModel> paginationSorting(@PathVariable("pnu") int pnu,@PathVariable("psize") int psize,@PathVariable("name") String name)
	{
		return vser.pagiationandSorting(pnu, psize, name);
	}
	
	

}

