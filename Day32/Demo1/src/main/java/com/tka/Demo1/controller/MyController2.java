package com.tka.Demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class MyController2 {
	
	@GetMapping("getmapping")
	public String myGetMapping() {
		
		return "get mapping annotation is on MyController2 class  work";
	}
	
	@GetMapping("getparticularrecord/{id}")
	public String getparticularRecord(@PathVariable int id) {
		
		System.out.println("Id is => "+id);
		
		return "Get Record....";
	}
	
	

}
