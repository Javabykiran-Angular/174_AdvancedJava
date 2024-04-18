package com.tka.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectAllRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/174_batch","root","Sumit@123");
			
			Statement stmt= con.createStatement();
			
			ResultSet rs= stmt.executeQuery("select * from employee");
			
			while(rs.next()) {
				int id= rs.getInt("id");
				String name= rs.getString("name");
				int sal= rs.getInt("salary");
				
				System.out.println("Id = "+id+" Name= "+name+" Salary= "+sal);
			}
			
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
