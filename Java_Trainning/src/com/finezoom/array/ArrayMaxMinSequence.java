package com.finezoom.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayMaxMinSequence {

	public static void main(String[] args) {

		int i, arraySize;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array");
		arraySize = sc.nextInt();
		int count = 0,countPlus=0;
		boolean success = false;
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> maxMinList =new ArrayList<Integer>();
		System.out.println("Enter elements in array");

		for (i = 0; i < arraySize; i++) {
			arrayList.add(sc.nextInt());
		}
		Collections.sort(arrayList);
		System.out.println("Sorting Array"+arrayList);
		for (int j = 0; j < arrayList.size(); j++) {
		if(success==false) {
			count++;
			maxMinList.add(arrayList.get(arrayList.size()-count));
			success = true;
		}else if(success==true){
			maxMinList.add(arrayList.get(0+countPlus));
			countPlus++;
			success = false;
		}
			
		}
		
		System.out.println(maxMinList.toString());
		sc.close();
	}

}
