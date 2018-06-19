package com.finezoom.basics.oops;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TeacherMain extends TeacherImplent {

	public static void main(String[] args) {
		ArrayList<Teacher> arrayList = new ArrayList<Teacher>();
		Teacher tech = null;
		TeacherMain techMain = new TeacherMain();
		Scanner scan = new Scanner(System.in);
		FileReader fr;
		Teacher techs = null;
		System.out.println("Are You Uplod File Press 1 or Manually Press2 ");
		String options = scan.nextLine();
		if (options.equals("1")) {
			//fileWayManiPulating();

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
				br.close();
			} catch (NumberFormatException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				chooseOperations();
		} else {
			
	
		
			//ArrayList<Teacher> arrayList = new ArrayList<Teacher>();
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
			chooseOperations();
			//manualWayManipulating();
		}
		int optionss = scan.nextInt();
		switch(optionss){
		case 1:{
			System.out.println("Enter the teacher Id");
			int id = scan.nextInt();
			ArrayList<Teacher> techFindDetail = techMain.find(arrayList, id);
			for (Teacher object : techFindDetail) {
				System.out.println(object.getId());
				System.out.println(object.getName());
				System.out.println(object.getAge());
				System.out.println(object.getAddress());
			}
			break;
		}
		case 2:{
			System.out.println("Enter the teacher Id");
			int updateId = scan.nextInt();
			ArrayList<Teacher> updateList = techMain.update(updateId, arrayList);
			for (Teacher updateData : updateList) {

				System.out.println(updateData.getId());
				System.out.println(updateData.getName());
				System.out.println(updateData.getAge());
				System.out.println(updateData.getAddress());

			}
			break;
		}
		case 3:{
			System.out.println("Enter the teacher Id");
			int removeid = scan.nextInt();
			ArrayList<Teacher> removedList = techMain.remove(removeid, arrayList);
			for (Teacher tt : removedList) {

				System.out.println(tt.getId());
				System.out.println(tt.getName());
				System.out.println(tt.getAge());
				System.out.println(tt.getAddress());

			}

			break;
		}
		default:
			System.out.println("Enter Valid Options");
		
		}
		ArrayList<Teacher> teachAddedList = techMain.add(arrayList);

		for (Teacher tt : teachAddedList) {

			System.out.println(tt.getId());
			System.out.println(tt.getName());
			System.out.println(tt.getAge());
			System.out.println(tt.getAddress());

		}
	

	
		scan.close();
	}
/*
	public static void manualWayManipulating() {

	}

	public static void fileWayManiPulating() {

		
	}*/

	public static void chooseOperations() {
		
		System.out.println("If You Want to Find press 1");
		System.out.println("If You Want to Update press 2");
		System.out.println("If You Want to Delete press 3");
		
	}
}
