package com.finezoom.basics.array;


import java.util.Scanner;

public class arrayCopybyItreator {
	public static void main(String args[]) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the array size");
	
	int count=0,arraysize=scan.nextInt();
	String stringArray[]=new String[arraysize],cophyarray[];
	for(int i=0;i<stringArray.length;i++)
	{ 
		count++;
		System.out.println("Enter the"+count+ "index value");
		stringArray[i]=scan.next();
		scan.close();
	}
	cophyarray=stringArray;
	System.out.println("The itrator array");
	
	for(String values:cophyarray) {
		System.out.println(values);
	}
	}
}
