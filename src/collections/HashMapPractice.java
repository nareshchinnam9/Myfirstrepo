package collections;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPractice implements Comparable {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hmap=new HashMap<Integer,String>();
		hmap.put(1, "Naresh");
		hmap.put(2, "Prathyusha");
		hmap.put(3, "Dhruthika");
		
		System.out.println(hmap);
		
		//Iteration over Hashmap: Iterator
		
			Iterator<Entry<Integer,String>> set=hmap.entrySet().iterator();
			
			while(set.hasNext())
				
			{
				Entry<Integer,String> s=set.next();
				System.out.println(s.getKey()+" " + s.getValue());
			}
			
		//Iteration via for loop:
			for (Map.Entry set1 : hmap.entrySet()) {
			    System.out.println(set1.getKey() + " = " + set1.getValue());
			}
			
		//Enumeration
			
			Enumeration<Integer> e=Collections.enumeration(hmap.keySet());
			while(e.hasMoreElements()) {
				
				Integer key=e.nextElement();
				String value=hmap.get(key);
				
				System.out.println("Key is: "+key+" Value is: "+value);
			}
			
			
		}
	


	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
		
	}


