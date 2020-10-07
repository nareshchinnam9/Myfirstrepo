package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList list1=new ArrayList();
		ArrayList list2=new ArrayList(25);
		ArrayList1 t1= new ArrayList1();
		
		for (int i=0;i<=8;i++) {
			list1.add(i);
			
		}
		
		t1.display(list1);
		
		System.out.println();
		
		
		t1.display1(list1);
		
		System.out.println(list1);

	}
	
	public void display(ArrayList list) {
		
		for (int i=0;i<list.size();i++) {
			
			System.out.print(list.get(i));
		}
		
	}
	
	public void display1(ArrayList list) {
		
		
		Iterator itr=list.iterator();
		
		while(itr.hasNext()) {
			
			System.out.print(itr.next());
		}
	}




}
