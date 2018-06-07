package com.finezoom.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class ArrayRemovingDuplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Map<String, Integer>> set = new HashSet<Map<String, Integer>>();
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("key1", 100);
		map.put("key2", 200);
		
		Set<Entry<String, Integer>> entries = map.entrySet();
		
		/*for(Entry<String, Integer> entry : entries)
		{
			System.out.println("Key :"+entry.getKey());
			System.out.println("Value :"+entry.getValue());
		}*/
		
		Iterator<Entry<String, Integer>> iterator = entries.iterator();
		
		while(iterator.hasNext())
		{
			Entry<String, Integer> entry = iterator.next();
			System.out.println("Key :"+entry.getKey());
			System.out.println("Value :"+entry.getValue());
			
		}
		
	}

}
