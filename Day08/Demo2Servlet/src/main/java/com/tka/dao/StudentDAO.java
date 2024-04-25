package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tka.entity.Student;

public class StudentDAO {
	
	final String Connection_Driver_Name="com.mysql.cj.jdbc.Driver";
	final String DB_Url="jdbc:mysql://localhost:3306/174_batch";
	final String DB_User="root";
	final String DB_Password="Sumit@123";
	
	Connection con=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	
	//Step 1 & 2
	public void openDB() {
		try {
			Class.forName(Connection_Driver_Name);
			
			con= DriverManager.getConnection(DB_Url,DB_User,DB_Password);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	// Step 3 & 4 
	
	public Student checkUser(String username,String password) {
		String query="select * from student where username=? and password=?";
		Student stud=null;
		try {
			openDB();	
			pst= con.prepareStatement(query);
			
			pst.setString(1, username);
			pst.setString(2, password);
			
			rs= pst.executeQuery();
			
			while(rs.next()) {
				stud=new Student();
				stud.setUsername(rs.getString("username")); 
				stud.setPassword(rs.getString("password"));
				stud.setId(rs.getInt("id"));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			closeDB();
		}
		
		return stud;
	}
	
	
	// Step 5 
	
	public void closeDB() {
		
		try {
		
			if(con!=null) {
				con.close();
				con=null;
			}
			
			if(pst!=null) {
				pst.close();
				pst=null;
			}
			
			if(rs!=null) {
				rs.close();
				rs=null;
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	

}
