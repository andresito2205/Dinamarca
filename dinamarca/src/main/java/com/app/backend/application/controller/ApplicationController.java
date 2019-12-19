package com.app.backend.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.backend.application.service.ApplicationService;
import com.app.backend.utilities.DTO.ApplicationDTO;

@CrossOrigin( origins = "http://localhost:4200")
@RestController
@RequestMapping(value ="/application", method = RequestMethod.GET)
public class ApplicationController {
	
	@Autowired
	private ApplicationService applicationService;
	
	@GetMapping("/findAll")
	public List<ApplicationDTO> greeting (){		
		List<ApplicationDTO> applicationList =  applicationService.findAll();
		return applicationList;
	}
	
	@RequestMapping(value="/newApplication", method=RequestMethod.POST)
	public String newApplication(@RequestBody String var){
		return applicationService.newAppli(var);
	}

}
