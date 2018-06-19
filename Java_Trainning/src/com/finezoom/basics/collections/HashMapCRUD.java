package com.finezoom.basics.collections;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class HashMapCRUD {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

	

		System.out.println("Enter the list of employee");
		int size = scan.nextInt();
      /*
       Adding Employee details Using HashMap
      */	
		ArrayList<Map<Integer, Employee>> Employeelist = HashMapUtil.addEmploye(scan, size);
		//HashMapUtil.forEach(Employeelist);
		//HashMapUtil.itreator(Employeelist);
		
		System.out.println("Enter the Update Id");
		int id =scan.nextInt();
		  /*
	       Updating Employee details Using HashMap
	      */	
		ArrayList<Map<Integer, Employee>> updatedlist=HashMapUtil.updateEmployee(Employeelist,id);
		HashMapUtil.forEach(updatedlist);
		HashMapUtil.itreator(updatedlist);
		System.out.println("Enter the find Id");
		int findId =scan.nextInt();
		/*
	       Updating Employee details Using HashMap
	      */	
		ArrayList<Map<Integer, Employee>> fidedEmploye=HashMapUtil.findEmployee(updatedlist,findId);
		HashMapUtil.forEach(fidedEmploye);
		HashMapUtil.itreator(fidedEmploye);
		System.out.println("Enter the Remove Id");
		int removeId =scan.nextInt();
		/*
	       Updating Employee details Using HashMap
	      */	
		ArrayList<Map<Integer, Employee>> removeEmploye=HashMapUtil.removedEmployee(updatedlist,removeId);
		HashMapUtil.forEach(removeEmploye);
		HashMapUtil.itreator(removeEmploye);
	}

}
