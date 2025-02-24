package com.ty.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestF
{
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("Anupama");
		al.add("Sabita");
		al.add("Kavita");
		al.add("Sunita");
		
		String name = al.get(0);
		System.out.println(name.toUpperCase());
		System.out.println("============using iterator==================");
		Iterator<String> li =al.iterator();
		while (li.hasNext())
		{
			String s = li.next();
			System.out.println(s);
		}
		System.out.println("============using list iterator===============");
		ListIterator<String> l=al.listIterator();
		while (l.hasNext()) 
		{
			String s = l.next();
			System.out.println(s);	
		}
		System.out.println("=============using for each loop===================");
		for (String string : al) 
		{
			System.out.println(string);	
		}
	}
}
