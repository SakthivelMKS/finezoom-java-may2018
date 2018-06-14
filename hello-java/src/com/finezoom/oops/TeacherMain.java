package com.finezoom.oops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TeacherMain extends TeacherImplent {

	public static void main(String[] args) {
		Teacher tech = null;

		
		TeacherMain techMain = new TeacherMain();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Array Size");
		ArrayList<Teacher> arrayList = new ArrayList<Teacher>();
		int arraySize = scan.nextInt();
		for (int i = 0; i < arraySize; i++) {
			tech = new Teacher();

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

//		ArrayList<Teacher> teach = techMain.add(arrayList);
//
//		for (Teacher tt : teach) {
//
//			System.out.println(tt.getId());
//			System.out.println(tt.getName());
//			System.out.println(tt.getAge());
//			System.out.println(tt.getAddress());
//
//		}
//		System.out.println("Enter the teacher Id");
//		int id = scan.nextInt();
//		ArrayList<Teacher> techDetails = techMain.find(arrayList, id);
//		for (Teacher object : techDetails) {
//			System.out.println(object.getId());
//			System.out.println(object.getName());
//			System.out.println(object.getAge());
//			System.out.println(object.getAddress());
//		}
		
		System.out.println("Enter the teacher Id");
		int removeid = scan.nextInt();
		ArrayList<Teacher> remove = techMain.remove(removeid);

		for (Teacher tt : remove) {

			System.out.println(tt.getId());
			System.out.println(tt.getName());
			System.out.println(tt.getAge());
			System.out.println(tt.getAddress());

		}

	}

}
