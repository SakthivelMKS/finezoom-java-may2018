package com.finezoom.jdbc;

import java.util.ArrayList;


import com.finezoom.collections.Employee;

public class EmployeMangement {

	public static void main(String[] args) {
	 EmployeeImplement empImp=new EmployeeImplement();
     ArrayList<Employee> employeList =empImp.addEmployee();
     EmployeUtil.itreator(employeList);
     ArrayList<Employee> updateList=empImp.updateEmployee();
     EmployeUtil.itreator(updateList);
     ArrayList<Employee> findList=empImp.findEmployee();
     EmployeUtil.itreator(findList);
     ArrayList<Employee> removedList=empImp.removeEmployee();
     EmployeUtil.itreator(removedList);
        
	}
}
