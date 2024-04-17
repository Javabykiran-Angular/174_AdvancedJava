package com.tka.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 Load & register driver class.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		// 2 Get JDBC Connection
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/174_batch", "root", "Sumit@123");
			
		//3  Create JDBC statement (SQL query).
			Statement stmt= con.createStatement();
			
		// 4 Execute the query and collect result.
			// insert into employee values("Sumit",15000)
		 
			int status= stmt.executeUpdate("insert into employee ('name','salary') values('Kiran','16000')");
			
			if(status>0) {
				System.out.println("Data addedd successfully...");
			}else {
				System.out.println("Data is not addedd successfully...");
			}
			//	5. Close all.
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		

	}

}
