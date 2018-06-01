package com.finezoom.com;

import java.util.Scanner;
public class primeNumberGivenpositions {
	
	 
	 
	  public static void main(String[] args) {
	 
	    Scanner sc = new Scanner(System.in);
	 
	    System.out.print("Enter n to compute the nth prime number: ");
	 
	    int positions = sc.nextInt();
	 
	    int number, count, i;
	    number=1;
	    count=0;
	 
	    while (count < positions){
	    	number=number+1;
	      for (i = 2; i <= number; i++){
	        if (number % i == 0) {
	          break;
	        
	        }
	      }
	      if ( i == number){
	        count = count+1;
	        System.out.println("Value of "+count+" prime: " + number);
	      }
	    }
	    System.out.println("Value of "+positions+" prime: " + number);
	  }
	
	

}
