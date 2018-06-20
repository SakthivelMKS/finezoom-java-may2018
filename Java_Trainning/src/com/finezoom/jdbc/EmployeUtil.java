package com.finezoom.jdbc;

import java.util.ArrayList;
import java.util.Iterator;

import com.finezoom.collections.Employee;

public class EmployeUtil {

	/*
	 * Itreator for employee details using ForEach
	 * @param employeDetails
	 */
	public static void forEach(ArrayList<Employee> employeDetails) {
		for (Employee emp : employeDetails) {
			System.out.println(emp.getEmpId() + emp.getEmpName() + emp.getEmpAge() + emp.getEmpSalary());
		}
	}

	/*
	 * Itreator for employee details using Itreator
	 *  @param employeDetails
	 */
	@SuppressWarnings("rawtypes")
	public static void itreator(ArrayList<Employee> employeDetails) {
		Iterator itr = employeDetails.iterator();
		while (itr.hasNext()) {
			Employee emps = (Employee) itr.next();
			System.out.println(emps.getEmpId() + emps.getEmpName() + emps.getEmpAge() + emps.getEmpSalary());
		}

	}

}
