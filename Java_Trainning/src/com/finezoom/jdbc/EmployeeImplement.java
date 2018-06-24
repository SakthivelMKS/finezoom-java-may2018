package com.finezoom.jdbc;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.finezoom.collections.Employee;

public class EmployeeImplement implements EmployeeInterface{
	 Employee emp = new Employee();
	 Scanner scan =new Scanner(System.in);

	@Override
	public  ArrayList<Employee> addEmployee() {
		System.out.println("Enter the size of the Employee");
       
        int employeeSize=scan.nextInt();
        ArrayList<Employee> empList = new ArrayList<>();
		  try {
	
       
   
        for (int i = 0; i < employeeSize; i++) {
        	emp =new Employee();
        	System.out.println("Enter the Employe Id");
			emp.setEmpId(scan.nextInt());
        	System.out.println("Enter the Employe Name");
			emp.setEmpName(scan.next());
        	System.out.println("Enter the Employe Age");
			emp.setEmpAge(scan.nextInt());
        	System.out.println("Enter the Employe Salary");
			emp.setEmpSalary(scan.nextInt());
			  empList.add(emp);
		}
        scan.close();
          
			try {
				jdbcSample.insertEmployee(empList);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			empList	=jdbcSample.selectEmployee();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println();
        return empList;
		
	}

	@Override
	public ArrayList<Employee> updateEmployee() {
		ArrayList <Employee> Emplist=null;
		try {
		System.out.println("Enter The current employee");
		int empId =scan.nextInt();
		System.out.println("Enter The Employee id For Update");
		emp.setEmpId(scan.nextInt());
		System.out.println("Enter The Employee name For Update");
		emp.setEmpName(scan.next());
		System.out.println("Enter The Employee age For Update");
		emp.setEmpAge(scan.nextInt());
		System.out.println("Enter The Employee salary For Update");
		emp.setEmpSalary(scan.nextInt());
		
			jdbcSample.updateEmployee(emp,empId);
			Emplist=jdbcSample.selectEmployee();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Emplist;
	}

	@Override
	public ArrayList<Employee> findEmployee() {
		ArrayList<Employee> employefind=null;
	
		try {
			System.out.println("Enter the Employee id");
			int findId=scan.nextInt();
			 employefind=jdbcSample.findEmployee(findId);
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employefind;
	}

	@Override
	public ArrayList<Employee> removeEmployee() {
		ArrayList<Employee> removedList=null;
	
		try {
			System.out.println("Enter the Employee id");
			int removeId=scan.nextInt();
		jdbcSample.removeEmployee(removeId);
		removedList=jdbcSample.selectEmployee();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return removedList;
	}

	@Override
	public ArrayList<Employee> allEmployee() {
	ArrayList<Employee> emplist=jdbcSample.selectEmployee();
		return emplist;
	}

}
