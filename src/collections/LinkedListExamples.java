package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExamples {
	LinkedList ll1=new LinkedList();
	
	int id;
	String name;
	int Marks;
	
	LinkedListExamples(){
		
	}
	LinkedListExamples(int id,String name,int Marks){
		this.id=id;
		this.name=name;
		this.Marks=Marks;
		
	}

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4};
		String s[]= {"Naresh","Prathyusha","Dhruthika","Ammu"};
		int m[]= {100,200,300,400};	
		
		LinkedListExamples obj=new LinkedListExamples();
		obj.add(a, s, m);
		//obj.display();
		obj.listIterator();
		
		
	}
	
	//Adding elements to Linked list
	
	public  void add(int a[],String s[],int m[]) {
		
		for(int i=0;i<a.length;i++) {
				
			ll1.add(new LinkedListExamples(a[i],s[i],m[i]));
			//System.out.println(ll1);
			
			
		}
		
			}
	
	
			/*
			 * public void display() {
			 * 
			 * Iterator itr=ll1.iterator();
			 * 
			 * while(itr.hasNext()) {
			 * 
			 * LinkedListExamples le=(LinkedListExamples) itr.next();
			 * 
			 * if(le.id%2==0) { System.out.println(le.id+" "+le.name+" "+le.Marks); }
			 * 
			 * } }
			 */
	
	public void listIterator() {
			ListIterator litr=ll1.listIterator();
			
			while(litr.hasNext())
			{
				LinkedListExamples l1=(LinkedListExamples) litr.next();
				System.out.println(l1.id+" "+l1.name+" "+l1.Marks);
				
			}
	}
				
}
