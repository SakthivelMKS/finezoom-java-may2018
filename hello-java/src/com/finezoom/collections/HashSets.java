package com.finezoom.collections;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class HashSets {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the list Size");
		int listSize = scan.nextInt();
		/*
		 * Employee details adding using linked List
		 */
		// Employee Details added Method calling

		HashSet<Employee> employeList =HashSetUtil.addEmployeeDetails(listSize);
		HashSetUtil.itreator(employeList);
		HashSetUtil.forEach(employeList);

		System.out.println("Enter the update id");
		int id = scan.nextInt();
		// Employee Details update Method calling
		HashSet<Employee> updateList = HashSetUtil.update(id, employeList);
		HashSetUtil.itreator(updateList);
		HashSetUtil.forEach(updateList);
		// Employee Details find Method calling
		System.out.println("Enter the find id");
		int empid = scan.nextInt();
		HashSet<Employee> findList = HashSetUtil.find(employeList, empid);
		HashSetUtil.itreator(findList);
		HashSetUtil.forEach(findList);
		System.out.println("Enter the remove id");
		int removeId = scan.nextInt();
		// Employee Details remove Method calling
		HashSet<Employee> RemovedList = HashSetUtil.remove(removeId, employeList);
		HashSetUtil.itreator(RemovedList);
		HashSetUtil.forEach(RemovedList);
	}

}
