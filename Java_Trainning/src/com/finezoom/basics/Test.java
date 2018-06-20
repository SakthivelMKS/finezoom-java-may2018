package com.finezoom.basics;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
public static void main(String[] args) {
	Address address = new Address();
	List<Object> list = new ArrayList<>();
	
	address.setDoorNo("5C");
	address.setCity("Chennai");
	list.add("Vijai");
	list.add(25);
	list.add(address);
	list.add(12.50);
	
	/*for(String name : list)
	{
		if(name.equals("Mari"))
			continue;
		System.out.println("Name is :"+name);
	}*/
	
	Iterator<Object> iterate = list.iterator();
	
	while(iterate.hasNext())
	{
		Object object = iterate.next();
		if(object instanceof String)
		{
			System.out.println("This is string type, ");
			System.out.println(object.toString());
		}
		else if(object instanceof Integer)
		{
			System.out.println("This is integer type, ");
			System.out.println(object.toString());
		}
		else if(object instanceof Address)
		{
			System.out.println("This is address type, ");
			Address address2 = (Address) object;
			System.out.println(address2.getDoorNo());
			System.out.println(address.getCity());
		}
	}
	
	
}
}
