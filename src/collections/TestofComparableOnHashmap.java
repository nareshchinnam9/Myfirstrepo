package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TestofComparableOnHashmap {
	
	static final int a = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> users=new HashMap<Integer,String>();
		
		ComparableOnHashmap c=new ComparableOnHashmap(2,"Naresh");
		ComparableOnHashmap c1=new ComparableOnHashmap(1,"Prathyusha");
		ComparableOnHashmap c2=new ComparableOnHashmap(3,"Dhruthika");
		
		users.put(c.id, c.name);
		users.put(c1.id,c1.name);
		users.put(c2.id, c2.name);
		
		List<Integer> l1=new ArrayList(users.keySet());
		
		Collections.sort(l1);
		
		System.out.println(l1);
		
	}

}
