package com.tka.main;

import com.tka.dao.EmployeeDao;
import com.tka.entity.Employee;

public class InsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDao dao=new EmployeeDao();
		
		Employee emp=new Employee();
		emp.setName("Shubham");
		emp.setMobileno("8521479634");
		
		int s= dao.insertData(emp);
		
		if(s>0) {
			System.out.println("Data is addedd..");
		}else {
			System.out.println("Data is not addedd..");
		}
		

	}

}
