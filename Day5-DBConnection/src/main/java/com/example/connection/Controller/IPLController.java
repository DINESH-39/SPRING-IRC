package com.example.connection.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.connection.Model.IPLModel;
import com.example.connection.Service.IPLService;

@RestController
@CrossOrigin(origins =  "http://localhost:3000")
public class IPLController {
	
	@Autowired
	public IPLService iser;
	
	@PostMapping("/saveIPL")
	public IPLModel addDetails(@RequestBody IPLModel ia)
	{
		return iser.saveInfo(ia);
	}
	
	@GetMapping("/getIPL")
	public List<IPLModel> getDetails()
	{
		return iser.getInfo();
	}

	@PutMapping("/updateIPL")
	public IPLModel updateDetails(@RequestBody IPLModel id)
	{
		return iser.updateInfo(id);
	}
	
	//delete by using @Pathvariable
	@DeleteMapping("/deleteIPL/{pid}")
	public String deleteDetails(@PathVariable int playerid)
	{
		iser.deleteInfo(playerid);
		return "Player Id "+playerid+" is deleted";
	}
	
	//delete by using @RequestParam\
	@DeleteMapping("/deletebyReq")
	public String deletebyRequestParam(@RequestParam("pid") int playerId)
	{
		iser.deleteInfo(playerId);
		return "Player Id "+playerId+" is deleted";
	}

	//sorting
	@GetMapping("/sortdes/{pname}")
	public List<IPLModel> sortPlayer(@PathVariable("pname") String pname)
	{
		return iser.sortDesc(pname);
	}
	
	//Pagination
	@GetMapping("/pagination/{pnu}/{psize}")
	public List<IPLModel> paginationData(@PathVariable("pnu") int pnu,@PathVariable("psize") int psize)
	{
		return iser.paginationData(pnu, psize);
	}
	
	//Pagination and sorting 
	@GetMapping("/paginationSorting/{pnu}/{psize}/{pname}")
	public List<IPLModel> paginationSorting(@PathVariable("pnu") int pnu,@PathVariable("psize") int psize,@PathVariable("pname") String pname)
	{
		return iser.paginationandSorting(pnu, psize, pname);
	}
	
	
	
}
