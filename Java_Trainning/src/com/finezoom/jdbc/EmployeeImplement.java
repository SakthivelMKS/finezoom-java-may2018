package com.finezoom.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.finezoom.collections.Employee;

public class EmployeeImplement implements EmployeeInterface{

	@Override
	public  ArrayList<Employee> addEmployee() {
		System.out.println("Enter the size of the Employee");
        Scanner scan =new Scanner(System.in);
        ArrayList<Employee> empList = new ArrayList<>();
		  try {
	
        Employee emp = null;
        int employeeSize=scan.nextInt();
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
			
		}
        scan.close();
            empList.add(emp);
			jdbcSample.insertEmployee(empList);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println();
        return empList;
		
	}

	@Override
	public ArrayList<Employee> updateEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Employee> findEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Employee> removeEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

}
