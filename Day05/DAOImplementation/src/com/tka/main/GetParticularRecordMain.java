package com.tka.main;

import com.tka.dao.EmployeeDao;
import com.tka.entity.Employee;

public class GetParticularRecordMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int id=3;
		
		EmployeeDao dao=new EmployeeDao();
		Employee emp= dao.getparticularRecordById(id);
		System.out.println(emp);
		

	}

}
