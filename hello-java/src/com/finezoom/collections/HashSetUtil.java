package com.finezoom.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HashSetUtil {
	/*
	 * Itreator for employee details using forEach
	 * 
	 * @param employeDetails
	 */
	public static void forEach(HashSet<Employee> employeDetails) {
		for (Employee emp : employeDetails) {
			System.out.println(emp.getEmpId() + emp.getEmpName() + emp.getEmpAge() + emp.getEmpSalary());
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

	

	/*
	 * Employee details added
	 */
	public static 	HashSet<Employee> addEmployeeDetails(int size) {
		int count = 1;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Employee emp = null;
		@SuppressWarnings("rawtypes")
		HashSet<Employee> hashLists = new HashSet<>();
		for (int i = 0; i < size; i++) {
			emp = new Employee();

			System.out.println("Enter the " + count + " Employee Details");
			System.out.println("Enter the Employee id");
			emp.setEmpId(scan.nextInt());
			System.out.println("Enter the Employee name");
			emp.setEmpName(scan.next());
			System.out.println("Enter the Employee age");
			emp.setEmpAge(scan.nextInt());
			System.out.println("Enter the Employee salary");
			emp.setEmpSalary(scan.nextInt());
			hashLists.add(emp);
			count++;
		}
		return hashLists;

	}

	/*
	 * Update method for employe details
	 * 
	 * @id
	 * 
	 * @arrayList
	 */
	public static HashSet<Employee> update(int id, HashSet<Employee> emplists) {
		HashSet<Employee> emp =null;
		
		
		Scanner scan = new Scanner(System.in);
		int index = 0;

		HashSet<Employee>  emplists1 = emplists;
		for (int i = 0; i < emplists1.size(); i++) {
			emp  = emplists.get
					

			if (id == emp.getEmpId()) {
				index = i;

			}

		}
		System.out.println("Enter the id for update");
		hashSet.get(index).setEmpId(scan.nextInt());
		System.out.println("Enter the name for update");
		hashSet.get(index).setEmpName(scan.next());
		System.out.println("Enter the Age for update");
		hashSet.get(index).setEmpAge(scan.nextInt());
		System.out.println("Enter the address for update");
		hashSet.get(index).setEmpSalary(scan.nextInt());

		return linkList;
	}

	/*
	 * Remove method for employe details
	 * 
	 * @id
	 * 
	 * @arrayList
	 */

	public static HashSet<Employee> remove(int id, HashSet<Employee> linkList) {

		Employee emp = null;

		HashSet<Employee>  removedList = linkList;
		int index = 0, value = 0;
		for (Employee emps : linkList) {
			if (id == emps.getEmpId()) {
				value = index;
				emps.getEmpId();
				emps.getEmpName();
				emps.getEmpAge();
				emps.getEmpSalary();
			}
			index++;
		}
		linkList.remove(value);
		return linkList;

	}

	/*
	 * find method for employe details
	 * 
	 * @id
	 * 
	 * @arrayList
	 */
	public static HashSet<Employee>find(HashSet<Employee>hashList, int id) {

		Employee emp = new Employee();

		HashSet<Employee>list1 = new HashSet<Employee>();
		int index = 0;

		for (int i = 0; i < hashList.size(); i++) {
			emp = ((List<Employee>) hashList).get(i);

			if (id == emp.getEmpId()) {
				index = i;
				emp.setEmpId(emp.getEmpId());
				emp.setEmpName(emp.getEmpName());
				emp.setEmpAge(emp.getEmpAge());
				emp.setEmpSalary(emp.getEmpSalary());
				list1.add(emp);
			}

		}

		return list1;
	}

}
