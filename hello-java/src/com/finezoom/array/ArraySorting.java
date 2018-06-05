package com.finezoom.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {

        int i,n,t;          

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of array");

        n=sc.nextInt();

        Integer a[] = new Integer[n];
        
        Integer sd = new Integer(43);
        


        System.out.println("Enter elements in array");

        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
           
        }
        Arrays.sort(a);
       for(int value:a){
    	   System.out.println("Uno");
    	   
       }
        Arrays.sort(a, Collections.reverseOrder());
     for(int value:a)
        System.out.println("Greates integer is" +value);
    }

}
