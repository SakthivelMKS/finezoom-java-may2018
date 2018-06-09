package com.finezoom.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayMaxFromRightSide {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		int i,count=0, arraySize;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array");
		arraySize = sc.nextInt();
		int c,countPlus=0;

		List <Integer>arrayList = new ArrayList<Integer>();
		List <Integer>maxMinList =new ArrayList<Integer>();
		System.out.println("Enter elements in array");

		for (i = 0; i < arraySize; i++) {
			arrayList.add(sc.nextInt());
		}
		System.out.println("Sorting Array"+arrayList);
		for (int j = 0; j < arrayList.size()-1; j++) {
			
				if(arrayList.get(j)<arrayList.get(j+1)) {
					maxMinList.add(arrayList.get(j+1));
				}else {
				maxMinList.add(arrayList.get(j));
			}
			
				
				
		
		
	}
		System.out.println(maxMinList.toString());
	}
}
