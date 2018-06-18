package com.finezoom.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedLists {

	public static void main(String[] args) {

	
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the list Size");
		int listSize = scan.nextInt();
		/*
		 * Employee details adding using linked List
		 */
		// Employee Details added Method calling
		List<Employee> employeLists = LinkedListUtil.addEmployeeDetails(listSize);
		LinkedListUtil.itreator(employeLists);
		LinkedListUtil.forEach(employeLists);
            
		System.out.println("Enter the update id");
		int id = scan.nextInt();
		// Employee Details update Method calling
		List<Employee> updateList = LinkedListUtil.update(id, employeLists);
		LinkedListUtil.itreator(updateList);
		LinkedListUtil.forEach(updateList);
		// Employee Details find Method calling
		System.out.println("Enter the find id");
		int empid = scan.nextInt();
		List<Employee> findList = LinkedListUtil.find(updateList, empid);
		LinkedListUtil.itreator(findList);
		LinkedListUtil.forEach(findList);
		System.out.println("Enter the remove id");
		int removeId = scan.nextInt();
		// Employee Details remove Method calling
		List<Employee> RemovedList = LinkedListUtil.remove(removeId, employeLists);
		LinkedListUtil.itreator(RemovedList);
		LinkedListUtil.forEach(RemovedList);

	}

}
