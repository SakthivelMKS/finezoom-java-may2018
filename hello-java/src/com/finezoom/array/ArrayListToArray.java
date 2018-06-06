package com.finezoom.array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListToArray {
	// TODO Auto-generated method stub
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the array size");
	int  count = 0, arraysize = scan.nextInt();
	String[] stringArray = new String[arraysize];
	ArrayList<String> arrayList= new ArrayList<String>();
	
	//values are added in the array
	for (int i = 0; i < arraysize; i++) {
		count++;
		System.out.println("Enter the" + count + "index value");
		
		arrayList.add(scan.next());
	}
	System.out.println(arrayList);
	stringArray=arrayList.toArray(new String[arrayList.size()]);
	System.out.println(stringArray);
}
}
