package com.tka.Demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tka.Demo1.entity.Employee;

@RestController
public class MyController {
	
	@RequestMapping("myfirstapi")
	public String myFirstAPI() {
		return "Hello Welcome my first Restful API...";
	}
	
	
	
	@RequestMapping(value = "mysecondapi",method = RequestMethod.POST)
	public String mySecondApi(@RequestBody Employee emp) {
		
		System.out.println("mySecondApi.....");
		
		System.out.println(emp);
		
		return "My Second API Works usin Http Post Method";
	}
	
	@RequestMapping(value = "mythirdapi",method = RequestMethod.PUT)
	public String mythirdApi(@RequestBody Employee emp) {
		
		System.out.println("===============");
		System.out.println(emp);
		
		return "My Third API Works usin Http put Method";
	}
	
	@RequestMapping(value = "myforuthapi",method = RequestMethod.DELETE)
	public String myfourthApi() {
		System.out.println("-------------");
		return "My Fourth API Works usin Http Delete Method";
	}
	
	@GetMapping("getmapping")
	public String myGetMapping() {
		
		return "get mapping annotation is work";
	}
	
	@PostMapping("postmapping")
	public String myPostMapping(@RequestBody Employee emp) {
		System.out.println(emp);
		return "Post mapping annotation is work";
	}
	
	
	

}
