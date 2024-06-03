package com.tka.DatabaseDemo.service;

import java.util.List;

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

	public String updateRecord(int id, Person p) {
	
		String msg= dao.updateRecord(id,p);
		return msg;		
		
	}

	public String deleteRecord(int id) {
		String msg= dao.deleteRecord(id);
		return msg;
		
	}

	public List<Person> getAllRecord() {
		List<Person> list= dao.getAllRecord();
		return list;
		
	}
	
	
	
	
	

}
