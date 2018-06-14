package com.finezoom.oops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeacherImplent implements TeacherInterface {
	ArrayList<Teacher> arrayList = new ArrayList<Teacher>();

	@Override
	public ArrayList<Teacher> add(ArrayList<Teacher> arrayList) {

		Teacher teacher1 = null;
		for (Teacher teacher : arrayList) {
			System.out.println("in implementations");
			System.out.println(teacher.getId());
			System.out.println(teacher.getName());
			System.out.println(teacher.getAge());
			System.out.println(teacher.getAddress());
			// teacher1 = teacher;

		}

		// TODO Auto-generated method stub
		// int id=(int) arrayList.get(0);
		// String name=(String) arrayList.get(1);
		// String age=(String) arrayList.get(2);
		// String address=(String) arrayList.get(3);
		// tech.setId(id);
		// tech.setName(name);
		// tech.setName(age);
		// tech.setName(address);

		return arrayList;
	}

	@Override
	public ArrayList<Teacher> update(Teacher teach) {

		return null;
	}

	@Override
	public ArrayList<Teacher> remove(int id) {

		Teacher techs = null;
		
		ArrayList<Teacher> removedList = new ArrayList();
		int index = 0;

		for (int i = 0; i < arrayList.size(); i++) {
			techs=arrayList.get(i);
			// System.out.println(teacher1.getId());
			// System.out.println(teacher1.getName());
			// System.out.println(teacher1.getAge());
			// System.out.println(teacher1.getAddress());
			if (id == techs.getId()) {
				index = i;
				techs.setId(techs.getId());
				techs.setName(techs.getName());
				techs.setAge(techs.getAge());
				techs.setAddress(techs.getAddress());

			}

		}
		arrayList.remove(index-1);
		removedList.addAll(arrayList);
		return removedList;

	}

	@Override
	public ArrayList<Teacher> find(ArrayList<Teacher> arrayList, int id) {

		Teacher teacher1 = null;
		//ArrayList list = new ArrayList();
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
