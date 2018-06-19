package com.finezoom.basics.array;


import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListToArray {
	// TODO Auto-generated method stub
public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the array size");
	int  count = 0, arraysize = scan.nextInt();
	String[] stringArray = new String[arraysize];
	String[] manualarray = new String[arraysize];
	ArrayList<String> arrayList= new ArrayList<String>();
	
	//values are added in the array
	for (int i = 0; i < arraysize; i++) {
		count++;
		System.out.println("Enter the" + count + "index value");
		
		arrayList.add(scan.next());
	}
	System.out.println(arrayList);
	for(int i=0;i< arrayList.size();i++) {
		
		manualarray[i]=arrayList.get(i);
	}
	System.out.println("manualarray"+manualarray[0]);
	stringArray=arrayList.toArray(new String[arrayList.size()]);
	System.out.println(stringArray);
	for(String stringValue:stringArray) {
		System.out.println("The value"+stringValue);
	}
	scan.close();
	
}
}
