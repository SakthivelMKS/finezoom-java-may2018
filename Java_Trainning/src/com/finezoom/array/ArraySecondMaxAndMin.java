package com.finezoom.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySecondMaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size");
	
		int  count = 0, arraysize = scan.nextInt();
		int[] stringArray = new int[arraysize];
	
		//values are added in the array
		for (int i = 0; i < stringArray.length; i++) {
			count++;
			System.out.println("Enter the" + count + "index value");
			stringArray[i] = scan.nextInt();
		}
		Arrays.sort(stringArray);
		
		StringBuilder build=new StringBuilder();
		for(int arrayValue:stringArray){
		build.append(arrayValue);
		}
		System.out.println(build);
		System.out.println("SecondMaximum"+stringArray[arraysize-2]);
		System.out.println("SecondMinimum"+stringArray[1]);
		scan.close();
	}

}
