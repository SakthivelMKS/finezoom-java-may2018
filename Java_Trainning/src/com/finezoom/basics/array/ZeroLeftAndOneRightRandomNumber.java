package com.finezoom.basics.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZeroLeftAndOneRightRandomNumber {

	public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);

			int  count = 0, firstArraySize;
			System.out.println("Enter the first Array size");
			firstArraySize = scan.nextInt();
			

			// System.out.println("Enter the Element " + number + " of an Array");
			List<Integer> firstArray = new ArrayList<Integer>();
			
			// Logic for length of array finding
			for (int i = 0; i < firstArraySize; i++) {
				count++;
				System.out.println("Please enter first array" + count + " number");
				firstArray.add(scan.nextInt());

			}
			List<Integer> zeroArrays = new ArrayList<Integer>();
			List<Integer> oneArrays = new ArrayList<Integer>();
			for(int value:firstArray) {
				
				if(value==0) {
					zeroArrays.add(value);
				}else {
					oneArrays.add(value);
					
				}
			}
			for (Integer integer : oneArrays) {
				zeroArrays.add(integer);
			}
			System.out.println("After Sorting array"+zeroArrays.toString());
			scan.close();

	}

}
