package com.finezoom.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ArrayList<Employee> arrayList = new ArrayList();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the ArrayList Size");
		int arraySize = scan.nextInt();
		// Employee emp = new Employee();

		ArrayList<Employee> employeDetails = ArrayUtils.addDetails(arraySize);
		ArrayUtils.itreator(employeDetails);
		ArrayUtils.forEach(employeDetails);
		
		System.out.println("Enter the update id");
		int id = scan.nextInt();
		ArrayList<Employee> updateList = ArrayUtils.update(id, employeDetails);
		ArrayUtils.forEach(updateList);
		
		System.out.println("Enter the find id");
		int ids = scan.nextInt();
		ArrayList<Employee> findList = ArrayUtils.find(employeDetails, ids);
		ArrayUtils.forEach(findList);
		
		System.out.println("Enter the Remove id");
		int empid = scan.nextInt();
		ArrayList<Employee> removedList = ArrayUtils.remove(empid, employeDetails);
		ArrayUtils.forEach(removedList);

	}

}
