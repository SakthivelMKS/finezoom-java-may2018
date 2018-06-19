package com.finezoom.basics.oops;

public class Encapsulation {

	public static void main(String[] args) {
		setter set=new setter();
		set.setAge("23");
		set.setName("sakthi");
		set.setDob("12/2/99"); 
		System.out.println("The name "+set.getName() +" and age "+ set.getAge()+" Dob "+set.getDob());
	}

}
