package com.finezoom.array;

public class IntegerUtils {
	
	// getting the miniumum value
	public static  int getMaxValue(int[] array) {
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
	
	public static String[] removeDuplicates(String[] input)
	{
		int j = 0;
		int i = 1;
		// return if the array length is less than 2
		if (input.length < 2)
		{
			return input;
		}
		while (i < input.length)
		{
			if (input[i] == input[j])
			{
				i++;
			}
			else
			{
				input[++j] = input[i++];
			}
		}
		String[] output = new String[j + 1];
		for (int k = 0; k < output.length; k++)
		{
			output[k] = input[k];
		}
		return output;
	}
		
		

}
