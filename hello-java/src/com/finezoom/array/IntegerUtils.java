package com.finezoom.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.omg.Messaging.SyncScopeHelper;

public class IntegerUtils {

	// getting the miniumum value
	public static int getMaxValue(int[] array) {
		int maxValue = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maxValue) {
				maxValue = array[i];
			}
		}
		return maxValue;
	}

	// getting the miniumum value
	public static int getMinValue(int[] array) {
		int minValue = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < minValue) {
				minValue = array[i];
			}
		}
		return minValue;
	}

	public static String[] removeDuplicates(String[] input) {
		int j = 0;
		int i = 1;
		// return if the array length is less than 2
		if (input.length < 2) {
			return input;
		}
		while (i < input.length) {
			if (input[i] == input[j]) {
				i++;
			} else {
				input[++j] = input[i++];
			}
		}
		String[] output = new String[j + 1];
		for (int k = 0; k < output.length; k++) {
			output[k] = input[k];
		}
		return output;
	}

	public static void pairOfElementsEqual(int array[], int number) {
		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == number) {
					System.out
							.println("The pair of values is " + array[i] + "+\t" + array[j] + " is equal to" + number);

				}
			}

		}

	}
	
	

	// Method for checking the arrays equal or not
	public static boolean equalityOfTwoArrays(int[] array1, int[] array2) {
		boolean equal = true;
		if (array1.length == array2.length) {
			for (int i = 0; i < array1.length; i++) {
				for (int j = 0; j < array2.length; j++) {
					if (array1[i] != array2[j]) {
						equal = false;

					}

				}
			}
		} else {
			equal = false;
		}
		return equal;
	}

	// Missing Number Logic
	public static int MissingNumber(int[] array) {
		int sum = 0, n, total, missingNumber;
		n = array.length + 1;

		// Logic for Missing Number
		total = n * (n + 1) / 2;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		missingNumber = total - sum;
		return missingNumber;

	}

	public static int[] commonElementArray(int[] firstArray, int[] secondArray, int[] thirdArray) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList();

		for (int i = 0; i < firstArray.length; i++) {

			for (int j = 0; j < secondArray.length; j++) {

				for (int k = 0; k < thirdArray.length; k++) {

					/*
					 * if(firstArray[i]== secondArray[j]) { if(firstArray[i] == thirdArray[k]) {
					 * System.out.println("FirstLogic"); //commonArray[i]=firstArray[i];
					 * list.add(firstArray[i]) ; int value=firstArray[i]; System.out.println(value);
					 * } }
					 */
					if ((firstArray[i] == secondArray[j]) && (firstArray[i] == thirdArray[k])) {
						System.out.println("seondLogic");
						// commonArray[i]=firstArray[i];
						list.add(firstArray[i]);
						int value = firstArray[i];
						System.out.println(value);

					}
				}

			}

		}

		int[] commonArray = list.stream().mapToInt(i -> i).toArray();

		return commonArray;
	}

	static int[] sortBasedOnZero(int arr[], int n) {
		int count = 0;

		for (int i = 0; i < n; i++)
			if (arr[i] != 0)
				arr[count++] = arr[i];

		while (count < n)
			arr[count++] = 0;
		return arr;
	}

	public static int longest_sequence(int[] nums) {
		final HashSet<Integer> h_set = new HashSet<Integer>();
		for (int i : nums)
			h_set.add(i);

		int longest_sequence_len = 0;
		for (int i : nums) {
			int length = 1;
			for (int j = i - 1; h_set.contains(j); --j) {
				h_set.remove(j);
				++length;
			}
			for (int j = i + 1; h_set.contains(j); ++j) {
				h_set.remove(j);
				++length;
			}
			longest_sequence_len = Math.max(longest_sequence_len, length);
		}
		return longest_sequence_len;
	}
}