package com.bluescope.java.training;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class JavaClassObjectExample {
public static void main(String args[]) {
	excute ex =new excute();
	ex.auther="Balagurusamy";
	ex.bookname="J2EE";
			ex.price=3000;
	String jj=ex.bookDetails();
	
	System.out.println("The return value:"+jj);
}
	
	 
}
  class excute{
	 String bookname;
		String auther;
		int price;
		
		public String bookDetails() {
			
			return bookname.concat(auther)+price;
		}
		
       public ArrayList bookDetails1(int a,int b) {
    	   ArrayList list=new ArrayList();
    	   list.add(a);
    	   list.add(b);
    	   String Result;
			Result=""+(a+b);
    	   list.add(Result);	
			return list;
		}
}

