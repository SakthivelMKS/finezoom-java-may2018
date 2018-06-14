package com.finezoom.oops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TeacherImplent implements TeacherInterface {
ArrayList<Teacher> arrayList = new ArrayList<Teacher>();

	@Override
	public ArrayList<Teacher> add(ArrayList<Teacher> arrayList) {

		//Teacher teacher1 = null;
		for (Teacher teacher : arrayList) {
			System.out.println("in implementations");
			System.out.println(teacher.getId());
			System.out.println(teacher.getName());
			System.out.println(teacher.getAge());
			System.out.println(teacher.getAddress());

		}

		return arrayList;
	}

	@Override
	public ArrayList<Teacher> update(int id, ArrayList<Teacher> arrayList) {
		Teacher teacher1 = null;
		// ArrayList list = new ArrayList();
		Scanner scan = new Scanner(System.in);
		//ArrayList<Teacher> list1 = new ArrayList<Teacher>();
		int index = 0;

		for (int i = 0; i < arrayList.size(); i++) {
			teacher1 = arrayList.get(i);

			if (id == teacher1.getId()) {
				index = i;

				
			}

		}
		System.out.println("Enter the id for update");
		arrayList.get(index).setId(scan.nextInt());
		System.out.println("Enter the name for update");
		arrayList.get(index).setName(scan.next());
		System.out.println("Enter the Age for update");
		arrayList.get(index).setAge(scan.next());
		System.out.println("Enter the address for update");
		arrayList.get(index).setAddress(scan.next());

		return arrayList;
	}

	@Override
	public ArrayList<Teacher> remove(int id, ArrayList<Teacher> arrayList) {

		Teacher techs = null;

		ArrayList<Teacher> removedList = arrayList;
		int index = 0, value = 0;
		for (Teacher teacher : removedList) {
			if (id == teacher.getId()) {
				value = index;
				teacher.getId();
				teacher.getName();
				teacher.getAge();
				teacher.getAddress();
			}
			index++;
		}
		removedList.remove(value);
		return removedList;

	}

	@Override
	public ArrayList<Teacher> find(ArrayList<Teacher> arrayList, int id) {

		Teacher teacher1 = null;
		// ArrayList list = new ArrayList();
		ArrayList<Teacher> list1 = new ArrayList<Teacher>();
		int index = 0;

		for (int i = 0; i < arrayList.size(); i++) {
			teacher1 = arrayList.get(i);

			if (id == teacher1.getId()) {
				index = i;
				teacher1.setId(teacher1.getId());
				teacher1.setName(teacher1.getName());
				teacher1.setAge(teacher1.getAge());
				teacher1.setAddress(teacher1.getAddress());
				list1.add(teacher1);
			}

		}

		return list1;
	}

}
