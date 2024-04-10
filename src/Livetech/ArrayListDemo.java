package Livetech;

import java.util.*;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList ();
		
		list.add("Scott");
		list.add(20);
		list.add("Smith");
		list.add(5.12);
		
		System.out.println("Before removing the size of the list is: "+list.size());
		System.out.println(list);
		
		list.add(1,"John");
		
		System.out.println("After updating the size of the list is: "+list.size());
		System.out.println(list);
		System.out.println();
		
		for(Object str:list)
		{
			System.out.println(str);
		}
	
	}

}
