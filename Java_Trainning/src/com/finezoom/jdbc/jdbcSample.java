package com.finezoom.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.finezoom.collections.Employee;

public class jdbcSample {

	public static void selectEmployee () {

		 
		try{  
		
		Connection con = connection(); 
		PreparedStatement stmt=con.prepareStatement("");  
		ResultSet rs=stmt.executeQuery("select * from employe");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getInt(4));  
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
	}

	public static Connection connection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");
		return con;
	}

	public static void insertEmployee(ArrayList<Employee> empList) throws ClassNotFoundException {
	 
		try {
			Connection con = connection(); 
			PreparedStatement ps=con.prepareStatement("insert into employe values(id,'name',age,salary)values (?,?,?,?)");
			for(Employee emps:empList){
				ps.setInt(1, emps.getEmpId());
				ps.setString(2, emps.getEmpName());
				ps.setInt(3, emps.getEmpId());
				ps.setInt(4, emps.getEmpId());
				ps.execute();
				 
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		 
		  
		
	}

}
