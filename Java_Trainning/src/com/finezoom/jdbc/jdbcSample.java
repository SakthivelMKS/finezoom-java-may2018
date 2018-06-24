package com.finezoom.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.finezoom.collections.Employee;

public class jdbcSample {

	public static ArrayList<Employee> selectEmployee() {

		ArrayList<Employee> empList = new ArrayList<>();
		try {

			Employee emp = null;
			Connection con = connection();
			PreparedStatement stmt = con.prepareStatement("");
			ResultSet rs = stmt.executeQuery("select * from employe");
			while (rs.next()) {
				emp = new Employee();
				emp.setEmpId(rs.getInt("id"));
				emp.setEmpName(rs.getString("name"));
				emp.setEmpAge(rs.getInt("age"));
				emp.setEmpSalary(rs.getInt("salary"));
				empList.add(emp);
				//System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + " " + rs.getInt(4));

			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return empList;
	}

	public static Connection connection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "root");
		return con;
	}

	public static void insertEmployee(ArrayList<Employee> empList) throws ClassNotFoundException, SQLException {
		Connection con = connection();
		try {
			
			PreparedStatement ps = con.prepareStatement("insert into employe values (?,?,?,?)");
			for (Employee emps : empList) {
				ps.setInt(1, emps.getEmpId());
				ps.setString(2, emps.getEmpName());
				ps.setInt(3, emps.getEmpId());
				ps.setInt(4, emps.getEmpId());
				ps.execute();

			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			 if(con!=null)
		            con.rollback();
			e.printStackTrace();
			
		}

	}
	
	public static void updateEmployee(Employee empList,int id) throws ClassNotFoundException {

		try {
			Connection con = connection();
			PreparedStatement ps = con.prepareStatement("update  employe  set id=?,name=?,age=?,salary=? where id=?");
			
				ps.setInt(1, empList.getEmpId());
				ps.setString(2, empList.getEmpName());
				ps.setInt(3, empList.getEmpAge());
				ps.setInt(4, empList.getEmpSalary());
				ps.setInt(5, id);
				ps.executeUpdate();

				System.out.println("The Employee Updated Successfully");

			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static ArrayList<Employee> findEmployee(int findId) throws ClassNotFoundException {
		ArrayList<Employee> findEmployee = new ArrayList<>();
		try {

			Employee emp = null;
			Connection con = connection();
			PreparedStatement stmt = con.prepareStatement("");
			ResultSet rs = stmt.executeQuery("select * from employe");
			while (rs.next()) {
				if(findId==rs.getInt("id")){
				emp = new Employee();
				emp.setEmpId(rs.getInt("id"));
				emp.setEmpName(rs.getString("name"));
				emp.setEmpAge(rs.getInt("age"));
				emp.setEmpSalary(rs.getInt("salary"));
				findEmployee.add(emp);
				}
				//System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + " " + rs.getInt(4));

			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return findEmployee;
		
	}

	public static void removeEmployee(int removeId) throws ClassNotFoundException {
		try {

			
			Connection con = connection();
			PreparedStatement ps = con.prepareStatement("delete from employe where id=?");
			ps.setInt(1, removeId);
			ps.executeUpdate();
			System.out.println("The Employee Removed Successfully");
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
