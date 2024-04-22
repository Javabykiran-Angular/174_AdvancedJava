package com.tka.main;

import com.tka.dao.EmployeeDao;
import com.tka.entity.Employee;

public class UpdateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp=new Employee();
		emp.setName("XYZ");
		emp.setId(1);
		
		EmployeeDao dao=new EmployeeDao();
		int status= dao.Updatedata(emp);
		
		if(status>0) {
			System.out.println("Data is updatated...");
		}else {
			System.out.println("Data is not updatated...");
		}
		

	}

}
