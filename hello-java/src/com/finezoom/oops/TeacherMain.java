package com.finezoom.oops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TeacherMain  extends TeacherImplent{

	public static void main(String[] args) {
		Teacher tech =null;
		
//		arrayList.add(1);
//		arrayList.add("sakthi");
//		arrayList.add("23");
//		arrayList.add("Address");
		TeacherMain techMain =new TeacherMain();
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter The Array Size");
	ArrayList<Teacher> arrayList = new ArrayList<Teacher>();
	int arraySize=scan.nextInt();
	for (int i = 0; i < arraySize; i++) {
		tech= new Teacher();
	
		System.out.println("Enter the id");
		tech.setId(scan.nextInt());
		System.out.println("Enter the name");
		tech.setName(scan.next());
		System.out.println("Enter the age");
		tech.setAge(scan.next());
		System.out.println("Enter the Address");
		tech.setAddress(scan.next());
		arrayList.add(tech);
	}
//		tech.setId(1);
//		tech.setName("Sakthivel");
//		tech.setAge("c");
//		tech.setAddress("Dpi");
//		arrayList.add(tech);
		
		
		
		ArrayList<Teacher> teach=techMain.add(arrayList);
		
		//ArrayList<Teacher> techs=teach;
		for (Teacher tt  : teach) {
			
			System.out.println("in main implementations");
			System.out.println(tt.getId());
			System.out.println(tt.getName());
			System.out.println(tt.getAge());
			System.out.println(tt.getAddress());
		
		}
		System.out.println("Enter the name");
		String name=scan.nextLine();
		ArrayList  jj=techMain.find(arrayList, name);
		
		
		

	}
	
	

}
