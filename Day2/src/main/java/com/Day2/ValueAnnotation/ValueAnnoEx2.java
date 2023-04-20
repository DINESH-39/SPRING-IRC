package com.Day2.ValueAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ValueAnnoEx2 {

	@Value("${carname}")
	public String carname;
	@GetMapping("car")
	@ResponseBody
	public String display()
	{
		return "My favourite car : "+carname;
	}
	
}
