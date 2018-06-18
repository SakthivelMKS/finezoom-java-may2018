package com.finezoom.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMapUtil {

	/*
	 * Itreator for employee details using forEach
	 * 
	 * @param employeDetails
	 */
	@SuppressWarnings("unchecked")
	public static void forEach(ArrayList<Map<Integer, Employee>> employeelist) {

		for (int i = 0; i < employeelist.size(); i++) {

			for (Entry<Integer, Employee> entry : employeelist.get(i).entrySet()) {
				
				//System.out.println("entry" + entry.getKey());
				System.out.println("id: "+entry.getValue().getEmpId() +" Name: " +entry.getValue().getEmpName()
						+" Age: "+ entry.getValue().getEmpAge() +" Salary: "+ entry.getValue().getEmpSalary());
			}
		}
	}

	/*
	 * Itreator for employee details using Itreator
	 * 
	 * @param employeDetails
	 */
	@SuppressWarnings("rawtypes")
	public static void itreator(ArrayList<Map<Integer, Employee>> employeelist) {
		
		for (int i = 0; i < employeelist.size(); i++) {
		Iterator itr = employeelist.get(i).entrySet().iterator();

		while (itr.hasNext()) {
			 @SuppressWarnings("unchecked")
			Map.Entry <Integer, Employee> emp = (Map.Entry<Integer, Employee> )itr.next();
	           // System.out.println(emp.getKey());
	            System.out.println("id: "+emp.getValue().getEmpId()+" Name: "+emp.getValue().getEmpName()+" Age: "+emp.getValue().getEmpAge()+" Salary: "+emp.getValue().getEmpSalary());
	            //itr.remove(); // avoids a ConcurrentModificationException
		
		}
		}
	}
	/*
	 * addEmploye method for adding details
	 * 
	 * @id
	 * 
	 * @arrayList
	 */
	public static ArrayList addEmploye(Scanner scan, int size) {
		Employee emp = null;

		ArrayList<Map<Integer, Employee>> list = new ArrayList<Map<Integer, Employee>>();
		for (int i = 0; i < size; i++) {
			emp = new Employee();
			Map<Integer, Employee> map = new HashMap<Integer, Employee>();
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
	
	/*
	 * update  method for update details
	 * 
	 * @id
	 * 
	 * @arrayList
	 */

	public static ArrayList<Map<Integer, Employee>> updateEmployee(ArrayList<Map<Integer, Employee>> employeelist,
			int id) {
		Map<Integer, Employee>maps=new HashMap<>();
		Scanner scan=new Scanner(System.in);
		for (int i = 0; i < employeelist.size(); i++) {
			for(Entry<Integer, Employee> entry : employeelist.get(i).entrySet()) {
				Employee emps=new Employee();
				if(id==entry.getValue().getEmpId()) {
					System.out.println("Enter The Id for update");
					emps.setEmpId(scan.nextInt());
					System.out.println("Enter the Age for update");
					emps.setEmpAge(scan.nextInt());
					System.out.println("Enter the Name for update");
					emps.setEmpName(scan.next());
					System.out.println("Enter the salary for update");
					emps.setEmpSalary(scan.nextInt());
					//maps.put(i, emps);
					entry.setValue(emps);
				}
						
			}
			
		}
		//employeelist.add(maps);
		return employeelist;
	}
	
	/*
	 * findEmployee  method for update details
	 * 
	 * @id
	 * 
	 * @employeelist
	 */
	
	public static ArrayList<Map<Integer, Employee>> findEmployee(ArrayList<Map<Integer, Employee>> employeelist, int id) {
		ArrayList<Map<Integer, Employee>> findlist = new ArrayList<Map<Integer, Employee>>();
		Map<Integer, Employee>maps=new HashMap<>();
		for (int i = 0; i < employeelist.size(); i++) {
			for (Entry<Integer, Employee> entry : employeelist.get(i).entrySet()) {
				Employee emps=new Employee();
				if(id==entry.getValue().getEmpId()) {
					emps.setEmpId(entry.getValue().getEmpId());
					emps.setEmpAge(entry.getValue().getEmpSalary());
					emps.setEmpName(entry.getValue().getEmpName());
					emps.setEmpSalary(entry.getValue().getEmpSalary());
					maps.put(1, emps);
					findlist.add(maps);
				}
						
			}
			
		}
		return findlist;
	}

	/*
	 * removedEmployee  method for update details
	 * 
	 * @id
	 * 
	 * @employeelist
	 */
	public static ArrayList<Map<Integer, Employee>> removedEmployee(ArrayList<Map<Integer, Employee>> employeelist,
			int removeId) {
		int removedIndex=0;
		for (int i = 0; i < employeelist.size(); i++) {
		for(Entry<Integer, Employee> entry : employeelist.get(i).entrySet()) {
		
			if(removeId==entry.getValue().getEmpId()) {
				
				removedIndex=i;
			}
		}
		}
		employeelist.remove(removedIndex);
		return employeelist;
	}

}
