package com.finezoom.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapCRUD {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		Map <Integer,Employee> map=new HashMap();
		Employee emp ;
	
		System.out.println("Enter the list of employee");
		int size=scan.nextInt();
		
	ArrayList Employeelist=	HashMapUtil.addEmploye(scan, map, size);
	HashMapUtil.forEach(Employeelist);
	
	}

	
	
}


