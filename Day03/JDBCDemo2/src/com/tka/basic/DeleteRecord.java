package com.tka.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/174_batch", "root", "Sumit@123");
			
			Statement stmt= con.createStatement();
			
			int status= stmt.executeUpdate("delete from employee where id=3");
			if(status>0) {
				System.out.println("Data is deleted");
			}else {
				System.out.println("Data is not deleted");
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
