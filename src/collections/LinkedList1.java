package collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList1 {
	LinkedList ll1=new LinkedList();
	
	int id;
	String name;
	int Marks;
	
	LinkedList1(){
		
	}
	LinkedList1(int id,String name,int Marks){
		this.id=id;
		this.name=name;
		this.Marks=Marks;
		
	}

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4};
		String s[]= {"Naresh","Prathyusha","Dhruthika","Ammu"};
		int m[]= {100,200,300,400};	
		
		LinkedList1 obj=new LinkedList1();
		obj.add(a, s, m);
		//obj.display();
		obj.listIterator();
		obj.listIterator1();
		
	}
	
	//Adding elements to Linked list
	
	public  void add(int a[],String s[],int m[]) {
		
		for(int i=0;i<a.length;i++) {
				
			ll1.add(new LinkedList1(a[i],s[i],m[i]));
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
				LinkedList1 l1=(LinkedList1) litr.next();
				System.out.println(l1.id+" "+l1.name+" "+l1.Marks);
				
			}
	}
	
	public void listIterator1() {
		ListIterator litr=ll1.listIterator();
		
		while(litr.hasPrevious())
		{
			LinkedList1 l1=(LinkedList1) litr.previous();
			System.out.println(l1.id+" "+l1.name+" "+l1.Marks);
			
		}
}
				
}
