package com.finezoom.array;

import java.util.Iterator;
import java.util.Scanner;

public class arrayCopybyItreator {
	public static void main(String args[]) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter the array size");
	
	int index=0,count=0,arraysize=scan.nextInt();
	String stringArray[]=new String[arraysize],cophyarray[],indexValue;
	for(int i=0;i<stringArray.length;i++)
	{ 
		count++;
		System.out.println("Enter the"+count+ "index value");
		stringArray[i]=scan.next();
	}
	cophyarray=stringArray;
	System.out.println("The itrator array");
	
	for(String values:cophyarray) {
		System.out.println(values);
	}
	}
}
