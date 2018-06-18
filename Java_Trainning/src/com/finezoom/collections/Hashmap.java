package com.finezoom.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Hashmap {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		Map<Integer, Employee> employeeDetails = addEmployeeDetails();
		forEach(employeeDetails);
		itreator(employeeDetails);
		/*
		 * System.out.println("Enter id for update"); int updateId = scan.nextInt();
		 * Map<Integer, Employee>
		 * updateList=updateEmployeeDetails(employeeDetails,updateId);
		 * forEach(updateList); itreator(updateList);
		 * System.out.println("Enter id for find"); int findId = scan.nextInt();
		 * Map<Integer, Employee> findEmployee = findEmployeeDetails(employeeDetails,
		 * findId); forEach(findEmployee); itreator(findEmployee);
		 */
		System.out.println("Enter id for remove");
		int removeId = scan.nextInt();
		Map<Integer, Employee> removeEmployee = removeEmployeeDetails(employeeDetails, removeId);
		forEach(removeEmployee);
		itreator(removeEmployee);

	}

	/*
	 * itreator using display emp[loyee details
	 * 
	 * @employeeDetails
	 */
	private static void itreator(Map<Integer, Employee> employeeDetails) {

		// Map values itreating using iterator
		Iterator<Integer> itr = employeeDetails.keySet().iterator();
		while (itr.hasNext()) {
			Employee emp = employeeDetails.get(itr.next());
			System.out.println("Id: " + emp.getEmpId() + " Name: " + emp.getEmpName() + " Age:" + emp.getEmpAge()
					+ " Salary:" + emp.getEmpSalary());
		}

	}

	/*
	 * forEach using display emp[loyee details
	 * 
	 * @employeeDetails
	 */
	private static void forEach(Map<Integer, Employee> employeeDetails) {
		// Map values itreating using collections
		Collection<Employee> employees = employeeDetails.values();
		for (Employee emp : employees) {
			System.out.println("Id: " + emp.getEmpId() + " Name: " + emp.getEmpName() + " Age:" + emp.getEmpAge()
					+ " Salary:" + emp.getEmpSalary());
		}
		// Map values itreating using set with forEach
		Set<Map.Entry<Integer, Employee>> entrySet = employeeDetails.entrySet();
		for (Map.Entry<Integer, Employee> entry : entrySet) {
			Employee emp = entry.getValue();
			System.out.println("Id: " + emp.getEmpId() + " Name: " + emp.getEmpName() + " Age:" + emp.getEmpAge()
					+ " Salary:" + emp.getEmpSalary());
		}

	}

	/*
	 * Adding Employee details
	 * 
	 */

	private static Map<Integer, Employee> addEmployeeDetails() {
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		Employee emp;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Size of the employee");
		int size = scan.nextInt();
		for (int i = 0; i < size; i++) {
			emp = new Employee();
			System.out.println("Enter Id");
			emp.setEmpId(scan.nextInt());
			System.out.println("Enter Name");
			emp.setEmpName(scan.next());
			System.out.println("Enter age");
			emp.setEmpAge(scan.nextInt());
			System.out.println("Enter salary");
			emp.setEmpSalary(scan.nextInt());
			map.put(i, emp);
			scan.close();
		}
		return map;
	}

	/*
	 * Finding Employee details
	 * 
	 */
	@SuppressWarnings("unused")
	private static Map<Integer, Employee> findEmployeeDetails(Map<Integer, Employee> employeeDetails, int findId) {
		Collection<Employee> employees = employeeDetails.values();
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		Employee emp;
		for (Employee emps : employees) {
			emp = new Employee();
			if (emps.getEmpId() == findId) {
				emp.setEmpId(emps.getEmpId());
				emp.setEmpName(emps.getEmpName());
				emp.setEmpAge(emps.getEmpAge());
				emp.setEmpSalary(emps.getEmpSalary());
				map.put(1, emp);
			}
		}
		return map;
	}

	/*
	 * updateEmployeeDetails
	 * 
	 */
	@SuppressWarnings("unused")
	private static Map<Integer, Employee> updateEmployeeDetails(Map<Integer, Employee> employeeDetails, int findId) {
		Collection<Employee> employees = employeeDetails.values();
		int index = 0;
		Employee emp;
		for (Employee emps : employees) {
			emp = new Employee();
			if (emps.getEmpId() == findId) {
				emp = new Employee();
				System.out.println("Enter Id for update");
				emp.setEmpId(scan.nextInt());
				System.out.println("Enter Name for update");
				emp.setEmpName(scan.next());
				System.out.println("Enter age for update");
				emp.setEmpAge(scan.nextInt());
				System.out.println("Enter salary for update");
				emp.setEmpSalary(scan.nextInt());
				employeeDetails.put(index, emp);
			}
			index++;
		}
		return employeeDetails;
	}

	/*
	 * removeEmployeeDetails using id
	 * 
	 */
	private static Map<Integer, Employee> removeEmployeeDetails(Map<Integer, Employee> employeeDetails, int removeId) {
		/*
		 * Collection<Employee> employees = employeeDetails.values();
		 * 
		 * @SuppressWarnings({ "rawtypes", "unchecked" }) Map<Integer,
		 * Employee>employess=employeeDetails; int index=0; Employee emp; for (Employee
		 * emps : employees) { emp = new Employee(); if (emps.getEmpId() == removeId) {
		 * employeeDetails.remove(emps);
		 * 
		 * } index++; }
		 */
		Map<Integer, Employee> map = employeeDetails;
		// new ConcurrentHashMap<Integer, Employee>();

		for (int key : map.keySet()) {

			if (map.get(key).getEmpId() == removeId) {
				map.remove(key);
			}
		}

		return map;
	}
}
