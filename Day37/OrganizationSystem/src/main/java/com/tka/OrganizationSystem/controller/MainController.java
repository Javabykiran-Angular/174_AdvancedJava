package com.tka.OrganizationSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.OrganizationSystem.entity.Country;
import com.tka.OrganizationSystem.entity.Employee;
import com.tka.OrganizationSystem.service.MainService;

@RestController
@RequestMapping("api")
public class MainController {
	
	@Autowired
	MainService service;
	
	
	@PostMapping("addcountry")
	public String addCountry(@RequestBody Country c) {
		//System.out.println(c);
		
		String msg= service.addCountry(c);
		return msg;
		
	}
	
	@PutMapping("updatecountry/{id}")
	public String updateCountry(@PathVariable int id,@RequestBody Country c ) {
		
		String msg= service.updateCountry(id,c);
		return msg;
		
	}
	
	@PostMapping("addemp")
	public String 
	addEmployee(@RequestBody Employee emp) {
		
		String msg= service.addEmployee(emp);
		return msg;
		
	}
	
	@PutMapping("updateemp")
	public String updateEmployee(@RequestBody Employee emp) {
		
		String msg=service.updateEmployee(emp);
		
		return msg;
		
	}	
	@DeleteMapping("deleteemp/{id}")
	public String deleteEmployee(@PathVariable int id) {
		
		String msg=service.deleteEmployee(id);
		return msg;
		
	}	
	
	@GetMapping("getallemp")
	public List<Employee> getAllEmployee(){
		
		List<Employee> list=service.getAllEmployee();
		return list;
		
	}
	
	@GetMapping("getempbyid/{id}")
	public Employee getParticularById(@PathVariable int id) {
		
		Employee emp=service.getParticularById(id);
		
		return emp;
		
	}
	
	

}
