package com.tka.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/174_batch", "root", "Sumit@123");
			
			//PreparedStatement pstmt= con.prepareStatement("insert into employee(name,salary) values('Aniket',50000)");
			
			int sal=25000;
			String name="Parag";
			
			PreparedStatement pstmt= con.prepareStatement("insert into employee(name,salary) values(?,?)");
			pstmt.setInt(2, sal);
			pstmt.setString(1, name);
			
			int status=pstmt.executeUpdate();
			
			if(status>0) {
				System.out.println("Data is Added..");
			}else {
				System.out.println("Data is not Added..");
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
