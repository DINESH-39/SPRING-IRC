package com.Day2.ValueAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ValueAnnoEx3 {
	
	@Value("${cname:Ferrari}")
	public String cname;
	@GetMapping("car2")
	public String display()
	{
		return "My favourite car : "+cname;
	}

}
