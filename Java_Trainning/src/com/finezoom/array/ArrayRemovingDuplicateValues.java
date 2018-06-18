package com.finezoom.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class ArrayRemovingDuplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size");
		int  position = 0, arraySize = scan.nextInt();
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		Set<Integer> set=new HashSet<Integer>(); 
		//int array[] = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			position++;
			System.out.println("Please enter the " + position + " String");
			arrayList.add(scan.nextInt()); 
		}
		System.out.println("Array before removing duplicate elements"+arrayList.toString());
		System.out.println("Array before removing duplicate elements size"+arrayList.size());
		for(Object object:arrayList) {
		System.out.print(object);	
		}
		set.addAll(arrayList);
		arrayList.clear();
		arrayList.addAll(set);
		System.out.println("Array after removing duplicate elements"+set.toString());
		System.out.println("Array after removing duplicate elements size"+arrayList.size());
		for(Object object:set) {
		System.out.print(object);	
		}
		scan.close();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Set<Map<String, Integer>> set = new HashSet<Map<String, Integer>>();
			
			Map<String, Integer> map = new HashMap<String, Integer>();
			map.put("key1", 100);
			map.put("key2", 200);
			
			Set<Entry<String, Integer>> entries = map.entrySet();
			
			for(Entry<String, Integer> entry : entries)
			{
				System.out.println("Key :"+entry.getKey());
				System.out.println("Value :"+entry.getValue());
			}
			
			Iterator<Entry<String, Integer>> iterator = entries.iterator();
			
			while(iterator.hasNext())
			{
				Entry<String, Integer> entry = iterator.next();
				System.out.println("Key :"+entry.getKey());
				System.out.println("Value :"+entry.getValue());
				
			}
			
		}*/

}
