package Livetech;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		
		hm.put(101, "John");
		hm.put(102, "Scott");
		hm.put(103, "Smith");
		hm.put(104, "Kevin");
		
		System.out.println(hm);
		System.out.println("The size of hashmap is: "+hm.size());
		System.out.println();
		
		/*hm.remove(103);
		System.out.println("After removing a key: "+hm);*/
		
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
		
	}

}
