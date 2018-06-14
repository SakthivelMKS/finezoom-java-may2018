package com.finezoom.oops;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TeacherMain extends TeacherImplent {

	public static void main(String[] args) {
		Teacher tech = null;

		TeacherMain techMain = new TeacherMain();
		Scanner scan = new Scanner(System.in);

		ArrayList<Teacher> arrayList = new ArrayList<Teacher>();
		FileReader fr;
		Teacher techs = null;

		// stream = new BufferedReader(new FileReader(csvFileName));
		try {
			fr = new FileReader("D:/Java-Trainning/trunk/teacher.txt");
			BufferedReader br = new BufferedReader(fr);
			String line;

			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				techs = new Teacher();
				// String id=;
				techs.setId(Integer.parseInt(data[0]));
				techs.setName(data[1]);
				techs.setAge(data[2]);
				techs.setAddress(data[3]);

				arrayList.add(techs);
			}

		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Enter The Array Size");
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

		ArrayList<Teacher> teachAddedList = techMain.add(arrayList);

		for (Teacher tt : teachAddedList) {

			System.out.println(tt.getId());
			System.out.println(tt.getName());
			System.out.println(tt.getAge());
			System.out.println(tt.getAddress());

		}
		System.out.println("Enter the teacher Id");
		int id = scan.nextInt();
		ArrayList<Teacher> techFindDetail = techMain.find(arrayList, id);
		for (Teacher object : techFindDetail) {
			System.out.println(object.getId());
			System.out.println(object.getName());
			System.out.println(object.getAge());
			System.out.println(object.getAddress());
		}

		System.out.println("Enter the teacher Id");
		int updateId = scan.nextInt();
		ArrayList<Teacher> updateList = techMain.update(updateId, arrayList);
		for (Teacher updateData : updateList) {

			System.out.println(updateData.getId());
			System.out.println(updateData.getName());
			System.out.println(updateData.getAge());
			System.out.println(updateData.getAddress());

		}
		System.out.println("Enter the teacher Id");
		int removeid = scan.nextInt();
		ArrayList<Teacher> removedList = techMain.remove(removeid, arrayList);
		for (Teacher tt : removedList) {

			System.out.println(tt.getId());
			System.out.println(tt.getName());
			System.out.println(tt.getAge());
			System.out.println(tt.getAddress());

		}

	}
}
