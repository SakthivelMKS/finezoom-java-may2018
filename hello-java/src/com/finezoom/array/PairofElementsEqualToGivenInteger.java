package com.finezoom.array;

import java.util.Scanner;

public class PairofElementsEqualToGivenInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.out.println("Enter the Array Size");
				Scanner scan=new Scanner(System.in);
				int count=0, arraySize=scan.nextInt();
				int[]array=new int[arraySize];
				for(int i=0;i<arraySize;i++) {
					count++;
					System.out.println("Enter the"+count+" index value");
					array[i]=scan.nextInt();
				}
				System.out.println("Enter the number");
				int number=scan.nextInt();
				IntegerUtils.pairOfElementsEqual(array, number);
	}

}
