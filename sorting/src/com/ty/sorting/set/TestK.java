package com.ty.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestK
{
	public static void main(String[] args) 
	{
		Comparator<Employee1>comp=(e1,e2)->{
			if(e1.height>e2.height)
			{
				return 1;
			}
			else if(e1.height<e2.height)
			{
				return -1;
			}
			else
			{
				return 0;
			}
		};
		TreeSet<Employee1>ts=new TreeSet<>(comp);
		Employee1 e1=new Employee1(4, "niki", 5.6);
		Employee1 e2=new Employee1(1, "bhaskar", 5.2);
		Employee1 e3=new Employee1(5, "suresh", 5.1);
		Employee1 e4=new Employee1(3, "dinedh", 4.5);
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		System.out.println("============using iterator==========================");
		Iterator<Employee1>it=ts.iterator();
		while (it.hasNext()) 
		{
			Employee1 e = (Employee1) it.next();
			System.out.println("Name is "+e.name);
			System.out.println("Id is "+e.id);
			System.out.println("Height is "+e.height);
			System.out.println("---------------------------------------");
			
		}
	}

}
