package com.example.Day1.Exer1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ex1 {

		@GetMapping("/hello")
		@ResponseBody
		public String display()
		{
			return "Hello World";
		}

	}