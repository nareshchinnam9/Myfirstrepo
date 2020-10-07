package collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparbale {

	public static void main(String[] args) {
		ArrayList<ComparableInterface> users=new ArrayList<ComparableInterface>();
		
		ComparableInterface ci=new ComparableInterface(2,"Naresh");
		ComparableInterface ci1=new ComparableInterface(1,"Prathyusha");
		ComparableInterface ci2=new ComparableInterface(3,"Dhruthika");
		
			users.add(ci);
			users.add(ci1);
			users.add(ci2);
			
		Collections.sort(users);
		
		for(ComparableInterface u:users) {
			
			System.out.println(u.id+" "+u.name);
		}
		
		

	}

}
