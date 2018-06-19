package com.finezoom.basics.oops;

public class StringPool {
	
	public static void main(String[] args) {
		StringBuilder name = new StringBuilder("TAMILNADU");
		
		//String city = "TAMILNADU";
		
		System.out.println("Name :"+name.hashCode());
		//System.out.println("City :"+city.hashCode());
		
		//name = name.concat(" KING");
		//System.out.println("Name :"+name.hashCode());
		
		
		System.out.println("Name :"+name);
		
		uselessUpdate(name);
		System.out.println("Outside UM :"+name);
		System.out.println(name.hashCode());
		
		
		//Demo demo = new Demo();
		
		
	}

	private static void uselessUpdate(StringBuilder name) {
		System.out.println(name.hashCode());
		
		//Object temp = name;
	//	String another;
		//another  = (String) temp;
		//System.out.println();
		name = name.append(" KING");
		System.out.println("Inside UM :"+name);
		System.out.println(name.hashCode());
		
	}

}
