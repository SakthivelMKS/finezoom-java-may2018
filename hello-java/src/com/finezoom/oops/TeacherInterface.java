package com.finezoom.oops;

import java.util.ArrayList;

public interface TeacherInterface {

	// ArrayList find(ArrayList<Teacher> arrayList);
	ArrayList find(ArrayList<Teacher> arrayList, int id);

	ArrayList<Teacher> add(ArrayList<Teacher> arrayList);

	ArrayList<Teacher> update(int id, ArrayList<Teacher> arrayList);

	ArrayList<Teacher> remove(int id,ArrayList<Teacher>arrayList);

}