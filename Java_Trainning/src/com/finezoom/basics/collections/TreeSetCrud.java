package com.finezoom.basics.collections;

import java.util.Scanner;
import java.util.Set;

public class TreeSetCrud {

	public static void main(String[] args) {

		//ArrayList<Employee> arrayList = new ArrayList<Employee>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the ArrayList Size");
		int arraySize = scan.nextInt();
		;
		// Employee emp = new Employee();

		Set<Employee> employeDetails = TreeSetUtil.addDetails(arraySize);
		TreeSetUtil.itreator(employeDetails);
		TreeSetUtil.forEach(employeDetails);
		
		System.out.println("Enter the update id");
		int id = scan.nextInt();
		Set<Employee> updateList = TreeSetUtil.update(id, employeDetails);
		TreeSetUtil.forEach(updateList);
		
		System.out.println("Enter the find id");
		int ids = scan.nextInt();
		Set<Employee> findList = TreeSetUtil.find(employeDetails, ids);
		TreeSetUtil.forEach(findList);
		
		System.out.println("Enter the Remove id");
		int empid = scan.nextInt();
		Set<Employee> removedList = TreeSetUtil.remove(empid, employeDetails);
		TreeSetUtil.forEach(removedList);
		scan.close();

	}

}
