package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tka.entity.Employee;

public class EmployeeDao {
	
	final String DB_DriverName="com.mysql.cj.jdbc.Driver";
	final String DB_URL="jdbc:mysql://localhost:3306/174_batch";
	final String DB_Username="root";
	final String DB_Password="Sumit@123";
	
	Connection con=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	
	// Step 1 & 2 
	
	public void openDB() {
		try {
			Class.forName(DB_DriverName);
			
			con= DriverManager.getConnection(DB_URL,DB_Username,DB_Password);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	// step 3 & 4 
	
	public int insertData(Employee kuchbhi  ) {
		String query="insert into employee(name,mobileno) values(?,?)";
		int status=0;
		
		try {
			openDB();
			pst = con.prepareStatement(query);
			
			pst.setString(1, kuchbhi.getName());
			pst.setString(2, kuchbhi.getMobileno());			
			status = pst.executeUpdate();			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			closeDB();
		}
		
		return status;
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
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	

}
