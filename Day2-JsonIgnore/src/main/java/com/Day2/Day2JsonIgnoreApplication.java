package com.Day2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class Day2JsonIgnoreApplication {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(Day2JsonIgnoreApplication.class, args);
		
		Person p=new Person(1,"BhakthaPriyan",19);
		ObjectMapper obj=new ObjectMapper();
		String json=obj.writeValueAsString(p);
		System.out.println(json);
		
	}

}
