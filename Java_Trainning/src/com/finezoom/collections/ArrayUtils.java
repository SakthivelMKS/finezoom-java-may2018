package com.finezoom.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayUtils {
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

	/*
	 * Add method for employe details
	 * @arraySize
	 */
	@SuppressWarnings("unchecked")
	public static ArrayList<Employee> addDetails(int arraySize) {
		int count = 1;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Employee emp = null;
		@SuppressWarnings("rawtypes")
		ArrayList<Employee> arrayList = new ArrayList();
		for (int i = 0; i < arraySize; i++) {
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
			arrayList.add(emp);
			count++;
		}
		return arrayList;
	}

	/*
	 * Update method for employe details
	 * @id
	 * @arrayList
	 */
	public static ArrayList<Employee> update(int id, ArrayList<Employee> arrayList) {
		Employee emp = null;
	
		Scanner scan = new Scanner(System.in);
		
		int index = 0;

		for (int i = 0; i < arrayList.size(); i++) {
			emp = arrayList.get(i);

			if (id == emp.getEmpId()) {
				index = i;

			}

		}
		System.out.println("Enter the id for update");
		arrayList.get(index).setEmpId(scan.nextInt());
		System.out.println("Enter the name for update");
		arrayList.get(index).setEmpName(scan.next());
		System.out.println("Enter the Age for update");
		arrayList.get(index).setEmpAge(scan.nextInt());
		System.out.println("Enter the address for update");
		arrayList.get(index).setEmpSalary(scan.nextInt());

		return arrayList;
	}

	/*
	 * Remove method for employe details
	 * @id
	 * @arrayList
	 */

	public static ArrayList<Employee> remove(int id, ArrayList<Employee> arrayList) {

		Employee emp = null;

		ArrayList<Employee> removedList = arrayList;
		int index = 0, value = 0;
		for (Employee emps : removedList) {
			if (id == emps.getEmpId()) {
				value = index;
				emps.getEmpId();
				emps.getEmpName();
				emps.getEmpAge();
				emps.getEmpSalary();
			}
			index++;
		}
		removedList.remove(value);
		return removedList;

	}

	public static ArrayList<Employee> find(ArrayList<Employee> arrayList, int id) {

		Employee emp = null;
		// ArrayList list = new ArrayList();
		ArrayList<Employee> list1 = new ArrayList<Employee>();
		int index = 0;

		for (int i = 0; i < arrayList.size(); i++) {
			emp = arrayList.get(i);

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
