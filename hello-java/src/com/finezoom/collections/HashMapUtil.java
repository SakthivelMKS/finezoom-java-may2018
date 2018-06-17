package com.finezoom.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class HashMapUtil {
	
	/*
	 * Itreator for employee details using forEach
	 * 
	 * @param employeDetails
	 */
	@SuppressWarnings("unchecked")
	public static void forEach(ArrayList<Map>employeDetails) {
		for(Map<Integer, Employee>entry:employeDetails){
			
		for (int key : entry.keySet()) {
			System.out.println("entry"+key);
			System.out.println("id"+entry.get("id") + entry.get("EmpName")+ entry.get("getEmpAge") +  entry.get("getEmpSalary"));
		}
		}
	}

	/*
	 * Itreator for employee details using Itreator
	 * 
	 * @param employeDetails
	 */
	@SuppressWarnings("rawtypes")
	public static void itreator(HashSet<Employee> employeDetails) {
		Iterator itr = employeDetails.iterator();
		while (itr.hasNext()) {
			Employee emps = (Employee) itr.next();
			System.out.println(emps.getEmpId() + emps.getEmpName() + emps.getEmpAge() + emps.getEmpSalary());
		}

	}

	
	

	public static ArrayList addEmploye(Scanner scan, Map<Integer, Employee> map, int size) {
		Employee emp=null;
		 ArrayList<Map> list =new ArrayList<Map>();
		for (int i = 0; i < size; i++) {
			emp=new Employee();
		
			System.out.println("Enter the id");
			emp.setEmpId(scan.nextInt());
			System.out.println("Enter the Age");
			emp.setEmpAge(scan.nextInt());
			System.out.println("Enter the Name");
			emp.setEmpName(scan.next());
			System.out.println("Enter the salary");
			emp.setEmpSalary(scan.nextInt());
			map.put(i, emp);
			list.add(map);
	}
		
		
		return list;
		
	}

}
