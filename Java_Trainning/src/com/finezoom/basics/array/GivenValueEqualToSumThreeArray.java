package com.finezoom.basics.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GivenValueEqualToSumThreeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int  count = 0, secondArraySize, firstArraySize, thirdArraySize;
		System.out.println("Enter the first Array size");
		firstArraySize = scan.nextInt();
		System.out.println("Enter the second Array size");
		secondArraySize = scan.nextInt();
		System.out.println("Enter the third Array size");
		thirdArraySize = scan.nextInt();

		// System.out.println("Enter the Element " + number + " of an Array");
		List<Integer> firstArray = new ArrayList<Integer>();
		List<Integer> secondArray = new ArrayList<Integer>();
		List<Integer> thirdArray = new ArrayList<Integer>();
		// Logic for length of array finding
		for (int i = 0; i < firstArraySize; i++) {
			count++;
			System.out.println("Please enter first array" + count + " number");
			firstArray.add(scan.nextInt());

		}
		count = 0;
		for (int i = 0; i < secondArraySize; i++) {
			count++;
			System.out.println("Please enter second array" + count + " number");
			secondArray.add(scan.nextInt());

		}
		count = 0;
		for (int i = 0; i < thirdArraySize; i++) {
			count++;
			System.out.println("Please Enter the third array " + count + "number");
			thirdArray.add(scan.nextInt());

		}
		/*System.out.println("Enter The Number");
		int number=scan.nextInt();
		 */
		
		List<Integer> array = IntegerUtils.sumOfValueEqualToGivenValue(firstArray, secondArray, thirdArray);
		for (int commonValue : array) {
			System.out.println("commonValue of Three Array" + commonValue);

		}
		scan.close();
	}


	/*
	 * String ParamPurposeDescription = "Family Maintenance &#x2F; Savings"; String
	 * purposeDescription = "Family Maintainance"; if
	 * (ParamPurposeDescription.contains(purposeDescription)) {
	 * System.out.println("This is STP Transaction"); }
	 */
	
	 
}

