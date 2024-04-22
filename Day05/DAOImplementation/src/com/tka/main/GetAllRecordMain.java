package com.tka.main;

import java.util.ArrayList;

import com.tka.dao.EmployeeDao;
import com.tka.entity.Employee;

public class GetAllRecordMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDao dao=new EmployeeDao();
		ArrayList<Employee> list= dao.getAllRecord();
		
		for(Employee e:list) {
			System.out.println(e);
		}
		
		

	}

}
