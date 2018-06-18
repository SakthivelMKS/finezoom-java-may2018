package com.finezoom.array;

import java.util.Scanner;

public class ArrayMaxAndMin {

	public static void main(String[] args) {
				//variable and array declaration
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the array size");
				
				int  count = 0, arraysize = scan.nextInt();
				int intArray[] = new int[arraysize];
				//values are added in the array
				for (int i = 0; i < intArray.length; i++) {
					count++;
					System.out.println("Enter the" + count + "index value");
					intArray[i] = scan.nextInt();
				}
				//
				int max=IntegerUtils.getMaxValue(intArray);
				System.out.println("The Maximum Value of the array"+max);
				int min=IntegerUtils.getMinValue(intArray);
				System.out.println("The Mimi Value of the array"+min);
				//Using Collection frame Work to fin Max
				//  int maximum = Collections.max(Arrays.asList(intArray));
				  System.out.println("The Maximum Value of the array"+max);
				//Using Collection frame Work to fin Max
				//  int minimum = Collections.min(Arrays.asList(intArray));
				  System.out.println("The Maximum Value of the array"+max);
				  scan.close();
	}

}
