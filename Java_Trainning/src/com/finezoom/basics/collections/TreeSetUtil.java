package com.finezoom.basics.collections;


import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetUtil {

	/*
	 * Itreator for employee details using ForEach
	 * @param employeDetails
	 */
	public static void forEach(Set<Employee> employeDetails) {
		for (Employee emp : employeDetails) {
			System.out.println(emp.getEmpId() + emp.getEmpName() + emp.getEmpAge() + emp.getEmpSalary());
		}
	}

	/*
	 * Itreator for employee details using Itreator
	 *  @param employeDetails
	 */
	@SuppressWarnings("rawtypes")
	public static void itreator(Set<Employee> employeDetails) {
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

	public static Set<Employee> addDetails(int arraySize) {
		int count = 1;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		Set<Employee> employeList = new TreeSet<Employee>();
		for (int i = 0; i < arraySize; i++) {
			Employee  emp = new Employee();

			System.out.println("Enter the " + count + " Employee Details");
			System.out.println("Enter the Employee id");
			emp.setEmpId(scan.nextInt());
			//emp.setEmpId(scan.nextInt());
			System.out.println("Enter the Employee name");
			emp.setEmpName(scan.next());
			System.out.println("Enter the Employee age");
			emp.setEmpAge(scan.nextInt());
			System.out.println("Enter the Employee salary");
			emp.setEmpSalary(scan.nextInt());
			employeList.add(emp);
			count++;
		}
		return employeList;
	}

	/*
	 * Update method for employe details
	 * @id
	 * @arrayList
	 */
	public static Set<Employee> update(int id, Set<Employee> updateList) {
		//Employee emp = null;
		
	
		Scanner scan = new Scanner(System.in);
		
		

		for (Employee emp:updateList) {
			
			
			if (id == emp.getEmpId()) {
				
				System.out.println("Enter the id for update");
				emp.setEmpId(scan.nextInt());
				System.out.println("Enter the name for update");
				emp.setEmpName(scan.next());
				System.out.println("Enter the Age for update");
				emp.setEmpAge(scan.nextInt());
				System.out.println("Enter the address for update");
				emp.setEmpSalary(scan.nextInt());
			}

		}
		
		scan.close();
		return updateList;
	}

	/*
	 * Remove method for employe details
	 * @id
	 * @arrayList
	 */

	public static Set<Employee> remove(int id, Set<Employee> arrayList) {

	

		Set<Employee> removedList = arrayList;
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

	public static Set<Employee> find(Set<Employee> findList,int id) {

		Employee emps = new Employee();
		// ArrayList list = new ArrayList();
		Set<Employee> list1 = new TreeSet<Employee>();
		for (Employee emp:findList ) {
			

			if (id == emp.getEmpId()) {
				emps.setEmpId(emp.getEmpId());
				emps.setEmpName(emp.getEmpName());
				emps.setEmpAge(emp.getEmpAge());
				emps.setEmpSalary(emp.getEmpSalary());
				list1.add(emp);
			}

		}

		return list1;
	}

}
