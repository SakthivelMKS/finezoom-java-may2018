package com.finezoom.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size");
	
		int  count = 0, arraysize = scan.nextInt();
		String[] stringArray = new String[arraysize];
		
		//values are added in the array
		for (int i = 0; i < stringArray.length; i++) {
			
			System.out.println("Enter the" + count + "index value");
			stringArray[i] = scan.next();
		}
		//one way
		ArrayList<Object> arrayList=new ArrayList<Object>(Arrays.asList(stringArray));
		System.out.println(arrayList);
		//second Waye
		ArrayList<Object>collectionList=new ArrayList<Object>();
		Collections.addAll(collectionList, stringArray);
		System.out.println(collectionList);
		//Manual Way
		ArrayList<Object> manualList=new ArrayList<Object>();
		for(@SuppressWarnings("unused") String arr:stringArray){
			manualList.add(stringArray);
		}
		
		System.out.println(manualList);
		Iterator<Object> it=manualList.iterator();
				while(it.hasNext()){
					Object object = it.next();
					if(object instanceof Integer){
					System.out.println(object);
					}
					else if(object instanceof String){
						System.out.println(object);
						}
				}
				scan.close();
	}

}
