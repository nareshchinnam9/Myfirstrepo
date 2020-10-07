package collections;

import java.util.Enumeration;
//import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector v1=new Vector();
		Vector1 t1= new Vector1();
		
		for (int i=0;i<=8;i++) {
			v1.addElement(i);
			
		}
		
		t1.display(v1);
		
		System.out.println();
		
		
		t1.display1(v1);
		System.out.println();
		t1.display2(v1);
		
		//System.out.println(v1);

	}
	
	public void display(Vector v1) {
		
		for (int i=0;i<v1.size();i++) {
			
			System.out.print(v1.get(i));
		}
		
	}
	
	public void display1(Vector v1) {
		
		
		Iterator itr=v1.iterator();
		
		while(itr.hasNext()) {
			
			System.out.print(itr.next());
		}
	}

	public void display2(Vector v1) {
		
		
		Enumeration en=v1.elements();
		
		while(en.hasMoreElements()) {
			
			System.out.print(en.nextElement());
		}
	}




	}

