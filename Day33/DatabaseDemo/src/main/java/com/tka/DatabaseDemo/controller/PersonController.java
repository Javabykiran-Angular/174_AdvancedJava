package com.tka.DatabaseDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.DatabaseDemo.entity.Person;
import com.tka.DatabaseDemo.service.PersonService;

@RestController
@RequestMapping("person")
public class PersonController {
	
	@Autowired
	PersonService service;		
	
	@PostMapping("addperson")
	public String addPerson(@RequestBody Person p) {
		
		String strmsg= service.addperson(p);
		
		return strmsg;
		
		
	}

}
