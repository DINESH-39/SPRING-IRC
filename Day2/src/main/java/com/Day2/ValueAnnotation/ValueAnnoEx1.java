package com.Day2.ValueAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ValueAnnoEx1 {
	
	@Value("${name:Bhaktha}")
	public String name;
	@GetMapping("value")
	@ResponseBody
	public String display()
	{
		return "The name is "+name;
	}
}
