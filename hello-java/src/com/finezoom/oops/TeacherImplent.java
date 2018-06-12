package com.finezoom.oops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeacherImplent implements TeacherInterface {
  
	
	@Override
	public ArrayList<Teacher> add(ArrayList<Teacher> arrayList) {
		
		Teacher teacher1 = null;
		for(Teacher teacher :  arrayList )
		{
			System.out.println("in implementations");
			System.out.println(teacher.getId());
			System.out.println(teacher.getName());
			System.out.println(teacher.getAge());
			System.out.println(teacher.getAddress());
			//teacher1 = teacher;
			
		}
			
		// TODO Auto-generated method stub
//		int id=(int) arrayList.get(0);
//		String name=(String) arrayList.get(1);
//		String age=(String) arrayList.get(2);
//		String address=(String) arrayList.get(3);
//			tech.setId(id);
//			tech.setName(name);
//			tech.setName(age);
//			tech.setName(address);
			
		return  arrayList;
	}

	@Override
	public Teacher update(Teacher teach) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Teacher remove(Teacher teach) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public ArrayList find(ArrayList<Teacher> arrayList, String value) {

		Teacher teacher1 = null;
		ArrayList list=new ArrayList();
		for(Teacher teacher :  arrayList )
		{
			if(value.equals(teacher.getName()))
			{
			list.add("true");
			}
			else{
				list.add("false");
				
			}
			System.out.println("in implementations");
			System.out.println(teacher.getId());
			System.out.println(teacher.getName());
			System.out.println(teacher.getAge());
			System.out.println(teacher.getAddress());
			//teacher1 = teacher;
			
		}
		return list;
	}



}
