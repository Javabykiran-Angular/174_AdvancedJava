package com.tka.DatabaseDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.DatabaseDemo.dao.PersonDao;
import com.tka.DatabaseDemo.entity.Person;

@Service
public class PersonService {
	
	@Autowired
	PersonDao dao;
	
	public String addperson(Person p) {
		dao.addPerson(p);
		return "Data is addedd Successfully";
	}
	

}
