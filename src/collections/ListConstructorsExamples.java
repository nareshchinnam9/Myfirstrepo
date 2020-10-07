package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ListConstructorsExamples {
	
	

	public static void main(String[] args) {
		ArrayList a1= new ArrayList(); //default constructor
		Vector v1= new Vector(); //default constructor
		LinkedList L1= new LinkedList();//default constructor
		
		System.out.println(v1.capacity()); //By default the capacity of a vector is 10
		
		ArrayList a2= new ArrayList(25); //constructor with initial capacity
		Vector v2= new Vector(30); //constructor with initial capacity
		//LinkedList L= new LinkedList(30);//not allowed for linked list
		
		System.out.println(a2.size());
		
		System.out.println(v2.capacity());
		
		Vector v3= new Vector(10,5); //Initial capacity of 10 and once the initial capacity is filled then increase the capacity to 5
		
		System.out.println(v3.capacity());
		for(int i=0;i<10;i++) {
			v3.add(i);
			
		}
		v3.add(15);
		System.out.println(v3.capacity());
	}

}
