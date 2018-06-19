package com.finezoom.basics.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListUtil {
	/*
	 * Itreator for employee details using forEach
	 * 
	 * @param employeDetails
	 */
	public static void forEach(List<Employee> employeDetails) {
		for (Employee emp : employeDetails) {
			System.out.println(emp.getEmpId() + emp.getEmpName() + emp.getEmpAge() + emp.getEmpSalary());
		}
	}

	/*
	 * Itreator for employee details using Itreator
	 * 
	 * @param employeDetails
	 */
	
	public static void itreator(List<Employee> employeDetails) {
		Iterator<Employee> itr = employeDetails.iterator();
		while (itr.hasNext()) {
			Employee emps = itr.next();
			System.out.println(emps.getEmpId() + emps.getEmpName() + emps.getEmpAge() + emps.getEmpSalary());
		}

	}

	

	/*
	 * Employee details added
	 */
	public static List<Employee> addEmployeeDetails(int size) {
		int count = 1;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Employee emp = null;
		List<Employee> linkedLists = new LinkedList<Employee>();
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
			linkedLists.add(emp);
			count++;
		}
		return linkedLists;

	}

	/*
	 * Update method for employe details
	 * 
	 * @id
	 * 
	 * @arrayList
	 */
	public static List<Employee> update(int id, List<Employee> linkList) {
		Employee emp = null;
		Scanner scan = new Scanner(System.in);
		int index = 0;

		for (int i = 0; i < linkList.size(); i++) {
			emp = linkList.get(i);

			if (id == emp.getEmpId()) {
				index = i;

			}

		}
		System.out.println("Enter the id for update");
		linkList.get(index).setEmpId(scan.nextInt());
		System.out.println("Enter the name for update");
		linkList.get(index).setEmpName(scan.next());
		System.out.println("Enter the Age for update");
		linkList.get(index).setEmpAge(scan.nextInt());
		System.out.println("Enter the address for update");
		linkList.get(index).setEmpSalary(scan.nextInt());
		scan.close();
		return linkList;
	}

	/*
	 * Remove method for employe details
	 * 
	 * @id
	 * 
	 * @arrayList
	 */

	public static List<Employee> remove(int id, List<Employee> linkList) {

	
		//Employee emp = null;
		//List<Employee> removedList = linkList;
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
	public static List<Employee> find(List<Employee> linkList, int id) {

		Employee emp = new Employee();

		List<Employee> list1 = new LinkedList<Employee>();
		

		for (int i = 0; i < linkList.size(); i++) {
			emp = linkList.get(i);

			if (id == emp.getEmpId()) {
				
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
