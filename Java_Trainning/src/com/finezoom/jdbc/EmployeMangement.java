package com.finezoom.jdbc;

import java.util.ArrayList;


import com.finezoom.collections.Employee;

public class EmployeMangement {

	public static void main(String[] args) {
		EmployeeImplement empImp=new EmployeeImplement();
		
		System.out.println("Enter The Employe Id ");
     ArrayList<Employee> employeList =empImp.addEmployee();
     EmployeUtil.itreator(employeList);
        
	}
}
