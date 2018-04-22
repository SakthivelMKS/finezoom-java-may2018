package com.bluescope.java.training;

public class JavaStrings {

	public static void main(String[] args) {
		
   System.out.println("***Example of Java Strings***");
   String string1="Hello";
   String string2="Welcome to Java";
   System.out.println("String concations Examples");
      // way one using concat
   String string=string1.concat(string2);
   System.out.println("Final String"+string);
   //way to use +
   String strings=string1.concat(string2);
   System.out.println(strings);
   //Find String length using length
   System.out.println(strings.length());
   //Index of  using find the position
   System.out.println(strings.indexOf("W"));
   //find the index using  charAt()
   System.out.println(strings.charAt(10));
   //Using String contain
   System.out.println(string2.contains("Java"));
   //Ends with
   System.out.println(string2.endsWith("a"));
   //replac a paricular String 
   System.out.println(string2.replace("to", "At"));
	}

}
