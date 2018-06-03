package com.finezoom.com;

import java.util.Arrays;
import java.util.Scanner;

public class NumberToWords {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value");
		int  value = scan.nextInt();
		String castVariable;
		castVariable = String.valueOf(value);
		String a[] = new String[castVariable.length()];
		for (int i = 0; i < castVariable.length(); i++) {
        
			char singleDigits = castVariable.charAt(i);
			if(i==0){
				if (singleDigits == '1') {
					a[i] = "OneHundred";

				} else if (singleDigits == '2') {
					a[i] = "twoHundred";

				} else if (singleDigits == '3') {
					a[i] = "threeHundred";

				} else if (singleDigits == '4') {
					a[i] = "fourHundred";

				} else if (singleDigits == '5') {
					a[i] = "fiveHundred";

				}  else if (singleDigits == '6') {
					a[i] = "sixHundred";

				}
				else if (singleDigits == '7') {
					a[i] = "sevenHundred";

				}
				 else if (singleDigits == '8') {
						a[i] = "eightHundred";

					}
				 else if (singleDigits == '9') {
						a[i] = "nineHundred";

					}
				 else {
						a[i] = " ";

					}
			}
			if(i==1){
				if (singleDigits == '1') {
					a[i] = "Eleven";

				} else if (singleDigits == '2') {
					a[i] = "twenty";

				} else if (singleDigits == '3') {
					a[i] = "thrity";

				} else if (singleDigits == '4') {
					a[i] = "fourty";

				} else if (singleDigits == '5') {
					a[i] = "fifty";

				}  else if (singleDigits == '6') {
					a[i] = "sixty";

				}
				else if (singleDigits == '7') {
					a[i] = "seventy";

				}
				 else if (singleDigits == '8') {
						a[i] = "eighty";

					}
				 else if (singleDigits == '9') {
						a[i] = "ninety";

					}
				 else {
						a[i] = " ";

					}
			}
			if(i==2){
			if (singleDigits == '1') {
				a[i] = "one";

			} else if (singleDigits == '2') {
				a[i] = "two";

			} else if (singleDigits == '3') {
				a[i] = "three";

			} else if (singleDigits == '4') {
				a[i] = "four";

			} else if (singleDigits == '5') {
				a[i] = "five";

			}  else if (singleDigits == '6') {
				a[i] = "six";

			}
			else if (singleDigits == '7') {
				a[i] = "seven";

			}
			 else if (singleDigits == '8') {
					a[i] = "eight";

				}
			 else if (singleDigits == '9') {
					a[i] = "nine";

				}
			 else {
					a[i] = "six";

				}
		}
		}
		System.out.println("the Values" + Arrays.toString(a));
		StringBuilder builder = new StringBuilder();
		for (String values : a) {
			builder.append(values);
		}
		System.out.println("Your Enter Following Number" + builder.toString());
	}

}
