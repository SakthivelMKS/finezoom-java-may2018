package com.finezoom.basics.basics;


import java.util.Scanner;

public class EmployeManagementSystem {

	public static void main(String[] args)
	{  
		// TODO Auto-generated method stub
		/* Variables for declared for getting salray and sum the salary and average the salary*/
		int firstMonth,secondMonth,thirdMonth,fourthMonth,fifthMonth,sum,avg,Number,option,month;
		
		System.out.println("Enter The Last Five Mont Salary");
		Scanner scan =new Scanner(System.in);
		/* Value assigend to the variabels*/
		System.out.println("Enter the first Month Salary");
		firstMonth =scan.nextInt();
		System.out.println("Enter the second Month Salary");
		secondMonth =scan.nextInt();
		System.out.println("Enter the third Month Salary");
		thirdMonth =scan.nextInt();
		System.out.println("Enter the fourth Month Salary");
		fourthMonth =scan.nextInt();
		System.out.println("Enter the fifth Month Salary");
		fifthMonth =scan.nextInt();
			
		//double arr[] = new double[]{firstMonth, secondMonth,thirdMonth, fourthMonth, fifthMonth};	
		/* sum of th amount*/
		sum = firstMonth+secondMonth+thirdMonth+fourthMonth+fifthMonth;
		
		
			System.out.println("1.If you want go to nth maximum press '1'\n 2. If you want nth minimum press '2' \n 3.If you want go to Sum press  '3'\n 4.If you want go to Average press '4'\n 5.If you want Increment go to  press '5'\n 6.If you want Decrese go to  press '6'\n 7.If you want Decrese go to  press '7'\n");
			Number =scan.nextInt();
			double max;
				switch(Number)
				{
				/* Find the maximum salary*/
					case(1):{
						//int position;
						//System.out.println("Entert The Position");
						//position=scan.nextInt();
					    //double maxvalue =MaxAndMin.MaxValue(arr,position);
					   //System.out.println(maxvalue);
						
						if(firstMonth>secondMonth) {
							max=firstMonth;
					                	}
						else {
							max=secondMonth;
							}
						if(max>thirdMonth) {
							//max=max;
							}
						else {
							max=thirdMonth;
						}
						if(max>fourthMonth) {
							//max=max;
						}else {
							max=fourthMonth;
						}
						if(max>fifthMonth) {
							//max=max;
						}
						else {
							max=fifthMonth;
						}
						System.out.println("The maximum value"+max);
						
						
						
							break;
						
				        }
					/* Find the minimum salary*/
					
					case(2):{
						
						//int position;
						//System.out.println("The MiniMum value");
						//position=scan.nextInt();
				     	//double maxvalue =MaxAndMin.MaxValue(arr,position);
				    	//System.out.println(maxvalue);
						
						if(firstMonth<secondMonth) {
							max=firstMonth;
					                	}
						else {
							max=secondMonth;
							}
						if(max<thirdMonth) {
							//max=max;
							}
						else {
							max=thirdMonth;
						}
						
						if(max<fourthMonth) {
							//max=max;
						}else {
							max=fourthMonth;
						}
						if(max<fifthMonth) {
							//max=max;
						}
						else {
							max=fifthMonth;
						}
						System.out.println("The Minimum value"+max);
						break;
				        }
					/* Find the sum salary*/
					  case(3):{
						
						System.out.println("The sum of the value"+sum);
						break;
					  			}
					  /* Find the Average of the salary*/
					  case(4):{
						avg = sum/5;
						System.out.println("The Average of the salary"+avg);
						break;
					  			}
					  /* The salary are Increment by amount or percentage*/
					  case(5):{
						
						  		int incrementAmount,percentage;
						  		System.out.println("If you want Increase the salray by amount press '1' or percentage press '2'");
						  		option=scan.nextInt();
						  		if(option==1) {
								System.out.println("Enter the Amount if u increment");
								 incrementAmount=scan.nextInt();
								 System.out.println("which month u want to increment press '1' or '2' or '3' or'4' '5' ");
								 month=scan.nextInt();
								 if(month==1) {
								 firstMonth= firstMonth+incrementAmount;
								System.out.println("The Increment First Month Salary:"+firstMonth);
								 }
								 else if(month==2) {
								secondMonth=secondMonth+incrementAmount;
								System.out.println("The Increment second Month Salary:"+secondMonth);
								 }
								 else if(month==3) {
								thirdMonth=thirdMonth+incrementAmount;
								System.out.println("The Increment third Month Salary:"+thirdMonth);
								 }
								 else if(month==4) {
								fourthMonth=fourthMonth+incrementAmount;
								System.out.println("The Increment fourth Month Salary:"+fourthMonth);
								 }
								 else if(month==5) {
								fifthMonth=fifthMonth+incrementAmount;
								System.out.println("The Increment fifth Month Salary:"+fifthMonth);
								 }
							}
							else if(option==2) {
								
									System.out.println("Enter the Amount percentage if u increment");
								    incrementAmount=scan.nextInt();
								    System.out.println("which month u want to increment press '1' or '2' or '3' or'4' '5' ");
									 month=scan.nextInt();
										if(option==1) {
								    percentage=(firstMonth*incrementAmount)/100;
								    firstMonth=firstMonth+percentage;
								    System.out.println("The Increment First Month Salary:"+firstMonth);
										}
										else if(option==2) {
								    percentage=(secondMonth*incrementAmount)/100;
								    secondMonth= secondMonth+percentage;
									System.out.println("The Increment second Month Salary:"+secondMonth);
										}
										else if(option==3) {
									percentage=(thirdMonth*incrementAmount)/100;
									thirdMonth=thirdMonth+percentage;
									System.out.println("The Increment third Month Salary:"+thirdMonth);
										}
										else if(option==4) {
									percentage=(fourthMonth*incrementAmount)/100;
									fourthMonth=fourthMonth+percentage;
									System.out.println("The Increment fourth Month Salary:"+fourthMonth);
									}
										else if(option==5) {
									percentage=(fifthMonth*incrementAmount)/100;
									fifthMonth=fifthMonth+percentage;
									System.out.println("The Increment fifth Month Salary:"+fifthMonth);
									}
								
								}
							break;
							}
							
					     /* The salary are Decrease by amount or percentage*/
					     case(6):{
						  
						  int decreaseAmount,percentage;
							System.out.println("If you want Decrease the salray by amount press '1' or percentage press '2'");
							option=scan.nextInt();
							if(option==1 ) {
									System.out.println("Enter the Amount if u Decrease");
									decreaseAmount=scan.nextInt();
									firstMonth= firstMonth-decreaseAmount;
									System.out.println("The Decrement First Month Salary:"+firstMonth);
									secondMonth= secondMonth-decreaseAmount;
									System.out.println("The Decrement second Month Salary:"+secondMonth);
									thirdMonth=thirdMonth-decreaseAmount;
									System.out.println("The Decrement third Month Salary:"+thirdMonth);
									fourthMonth=fourthMonth+decreaseAmount;
									System.out.println("The Decrement fourth Month Salary:"+fourthMonth);
									fifthMonth=fifthMonth-decreaseAmount;
									System.out.println("The Decrement fifth Month Salary:"+fifthMonth);
								
							}
							else if(option==2) {
									System.out.println("Enter the Amount of percentage if u decrease");
									decreaseAmount=scan.nextInt();
									percentage= (firstMonth*decreaseAmount)/100;
									firstMonth=firstMonth-percentage;
									System.out.println("The decrease First Month Salary:"+firstMonth);
									percentage=(secondMonth*decreaseAmount)/100;
									secondMonth=secondMonth-percentage;
									System.out.println("The decrease second Month Salary:"+secondMonth);
									percentage=(thirdMonth*decreaseAmount)/100;
									thirdMonth=thirdMonth-percentage;
									System.out.println("The decrease third Month Salary:"+thirdMonth);
									percentage=(fourthMonth*decreaseAmount)/100;
									fourthMonth=fourthMonth-percentage;
									System.out.println("The decrease fourth Month Salary:"+fourthMonth);
									percentage=(fifthMonth*decreaseAmount)/100;
									fifthMonth=fifthMonth-percentage;
									System.out.println("The decrease fifth Month Salary:"+fifthMonth);
							
								}
							break;
							}
							
					     
					     case(7):
			
					     {
								System.out.println("If you want Ascending the salray by amount press '1' or Descending press '2'");
								option=scan.nextInt();
								
					    	 int value;
					    	 if(option==1) {
					    	 for(int i=0;i<5;i++) {
					    	 
					    	 if(firstMonth>secondMonth) {
					    		 
					    		  value=firstMonth;
					    		 firstMonth=secondMonth;
					    		 secondMonth=value;
					    	 }
					    	 	if(secondMonth>thirdMonth) {
					    		 
					    	 		value=secondMonth;
					    		 secondMonth=thirdMonth;
					    		 thirdMonth=value;
					    	 }
					    	 	if(thirdMonth>fourthMonth) {
						    		 
					    	 		value=thirdMonth;
					    	 		thirdMonth=fourthMonth;
					    	 		fourthMonth=value;
					    	 }
					    	 	if(fourthMonth>fifthMonth) {
						    		 
					    	 		value=fourthMonth;
					    	 		fourthMonth=fifthMonth;
					    	 		fifthMonth=value;
					    	 }
					    	 }
					    	 System.out.println("Asecnding orde:"+firstMonth+","+secondMonth+","+thirdMonth+","+fourthMonth+","+fifthMonth);
					    	 }
					    	 else {

						    	 for(int i=0;i<5;i++) {
						    	 
						    	 if(firstMonth<secondMonth) {
						    		 
						    		  value=firstMonth;
						    		 firstMonth=secondMonth;
						    		 secondMonth=value;
						    	 }
						    	 	if(secondMonth<thirdMonth) {
						    		 
						    	 		value=secondMonth;
						    		 secondMonth=thirdMonth;
						    		 thirdMonth=value;
						    	 }
						    	 	if(thirdMonth<fourthMonth) {
							    		 
						    	 		value=thirdMonth;
						    	 		thirdMonth=fourthMonth;
						    	 		fourthMonth=value;
						    	 }
						    	 	if(fourthMonth<fifthMonth) {
							    		 
						    	 		value=fourthMonth;
						    	 		fourthMonth=fifthMonth;
						    	 		fifthMonth=value;
						    	 }
						    	 }
						    	 System.out.println("Desending order:"+firstMonth+","+secondMonth+","+thirdMonth+","+fourthMonth+","+fifthMonth);
						    	 
					    	 }
					    	 break;
					    	 }
					     default:
					    	 System.out.println("Your enter Invalid option! plz try Again");
					    
							
						  			}
				scan.close();
						}
                }
		


