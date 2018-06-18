package com.finezoom.collections;

import java.util.HashSet;
import java.util.Iterator;
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
	 * @size
	 */
	public static HashSet<Employee> addEmployeeDetails(int size) {
		int count = 1;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Employee emp = null;
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
		//Employee emps = null;

		Scanner scan = new Scanner(System.in);
	

		
		for (Employee emp : emplists) {

			if (id == emp.getEmpId()) {
			

				System.out.println("Enter the id for update");
				emp.setEmpId(scan.nextInt());
				System.out.println("Enter the name for update");
				emp.setEmpName(scan.next());
				System.out.println("Enter the Age for update");
				emp.setEmpAge(scan.nextInt());
				System.out.println("Enter the address for update");
				emp.setEmpSalary(scan.nextInt());
				scan.close();
			}
		
		}

		return emplists;
	}

	/*
	 * Remove method for employe details
	 * 
	 * @id
	 * 
	 * @arrayList
	 */

	public static HashSet<Employee> remove(int id, HashSet<Employee> removedList) {

		Employee emp = null;
		
		HashSet<Employee> removedLists = removedList;
		
		for (Employee emps : removedLists) {

			emp=new Employee();
			if (id == emps.getEmpId()) {
				
			
				emp.setEmpId(emps.getEmpId());
				emp.setEmpName(emps.getEmpName());
				emp.setEmpAge(emps.getEmpAge());
				emp.setEmpSalary(emps.getEmpSalary());
			}
			
		}
	
	//	removedLists.remove(value);
		removedLists.remove(emp);
		return removedLists;

	}

	/*
	 * find method for employe details
	 * 
	 * @id
	 * 
	 * @arrayList
	 */
	public static HashSet<Employee> find(HashSet<Employee> emplists, int id) {

		Employee em = new Employee();

		HashSet<Employee> findList = new HashSet<Employee>();
		
		for (Employee emp : emplists) {

			if (id == emp.getEmpId()) {
				em.setEmpId(emp.getEmpId());
				em.setEmpName(emp.getEmpName());
				em.setEmpAge(emp.getEmpAge());
				em.setEmpSalary(emp.getEmpSalary());
				findList.add(em);
			}
			
		}
		
		return findList;
	}

}
