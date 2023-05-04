package com.example.log.Model;

import java.lang.ModuleLayer.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingModel
{

	Logger log=LoggerFactory.getLogger(Controller.class);
	@RequestMapping("/")
	public String demo()
	{
		log.info("information data");
		log.warn("warning data");
		log.debug("Debug message");
		log.error("error message");
		log.trace("trace message");
		
		return "completed";
	}
}
