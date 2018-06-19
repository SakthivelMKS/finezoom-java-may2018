package com.finezoom.basics.basics;


import java.util.Arrays;

public class MaxAndMin {
	
	
	
	public static double MaxValue(double[] array,int position)  {
		//Array.getShort(array, position);
		// Sort the given array
        Arrays.sort(array);
 
        // Return k'th element in 
        // the sorted array
        return array[position-1];
		
	}

}

