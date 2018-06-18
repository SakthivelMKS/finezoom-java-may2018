package com.finezoom.array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemovingDulpicatingValueFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size");
		String value;
		int index, count = 0, arraysize = scan.nextInt();
		String[] stringArray = new String[arraysize];
		String indexValue;
		//values are added in the array
		for (int i = 0; i < stringArray.length; i++) {
			count++;
			System.out.println("Enter the" + count + "index value");
			stringArray[i] = scan.next();
		}
		//Method for Handling 
       String []array=IntegerUtils.removeDuplicates(stringArray);
       for(String ar:array){
    	   System.out.println(ar);
       }
       HashSet<String> myVals = new HashSet<String>();

		Set<String> set = new HashSet<String>();
		for(int i = 0; i < stringArray.length; i++){
			  set.add(stringArray[i]);
			  myVals.add(stringArray[i]);
			}
		System.out.println(set.toString());
	}

}
