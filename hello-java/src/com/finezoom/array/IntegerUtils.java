package com.finezoom.array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
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
		ArrayList<Integer> list = new ArrayList<Integer>();

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

	public static List<Integer> sumOfValueEqualToGivenValue(List<?> firstArray, List<?> secondArray,
			List<?> thirdArray) {

		// TODO Auto-generated method stub
		// int number=numbers,
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < firstArray.size(); i++) {
			int firstarayValue = (int) firstArray.get(i);
			for (int j = 0; j < secondArray.size(); j++) {
				int secondArrayValue = (int) secondArray.get(j);
				for (int k = 0; k < thirdArray.size(); k++) {
					int thirdArrayValue = (int) thirdArray.get(0);
					// sum=firstarayValue+secondArrayValue+thirdArrayValue;

					if (firstarayValue <= secondArrayValue && thirdArrayValue <= secondArrayValue) {

						// calculate the value
						// of this special
						// triplet and add sum
						// of all values
						// of such triplets
						sum += (firstarayValue + secondArrayValue) * (secondArrayValue + thirdArrayValue);
						list.add(sum);
					}
					/*
					 * if(number==sum) {
					 * System.out.println("The array are containing following values");
					 * System.out.println("The first Array value"
					 * +firstarayValue+"The second Array value"
					 * +secondArrayValue+"The second Array value"+thirdArrayValue+"");
					 * list.add(firstarayValue); list.add(secondArrayValue);
					 * list.add(thirdArrayValue); }
					 */

				}

			}

		}

		return list;
	}

	public static int getTriangle(List<Integer> firstArray) {

		int n = firstArray.size();

		Collections.sort(firstArray);

		int count = 0;

		for (int i = 0; i < n - 2; ++i) {

			int k = i + 2;

			for (int j = i + 1; j < n; ++j) {
				while (k < n && firstArray.get(i) + firstArray.get(j) > firstArray.get(k))
					++k;

				count += k - j - 1;
			}
		}
		return count;

	}

	static boolean sum_pair(int arry[], int size, int sum) {
		int k;
		for (k = 0; k < size - 1; k++)
			if (arry[k] > arry[k + 1])
				break;

		int l = (k + 1) % size;

		int r = k;

		while (l != r) {
			if (arry[l] + arry[r] == sum)
				return true;
			if (arry[l] + arry[r] < sum)
				l = (l + 1) % size;

			else
				r = (size + r - 1) % size;
		}
		return false;
	}

	 public static void rotate(int[] nums, int k) {
	        int temp, previous;
	        for (int i = 0; i < k; i++) {
	            previous = nums[nums.length - 1];
	            for (int j = 0; j < nums.length; j++) {
	                temp = nums[j];
	                nums[j] = previous;
	                previous = temp;
	            }
	        }     
	 System.out.println(Arrays.toString(nums));       
	 }
}