package collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Test {
	LinkedList ll1=new LinkedList();
	
	int id;
	String name;
	int Marks;
	
	Test(){
		
	}
	Test(int id,String name,int Marks){
		this.id=id;
		this.name=name;
		this.Marks=Marks;
		
	}

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4};
		String s[]= {"Naresh","Prathyusha","Dhruthika","Ammu"};
		int m[]= {100,200,300,400};	
		
		Test obj=new Test();
		obj.add(a, s, m);
		//obj.display();
		obj.listIterator1();
		
	}
	
	//Adding elements to Linked list
	
	public  void add(int a[],String s[],int m[]) {
		
		for(int i=0;i<a.length;i++) {
				
			ll1.add(new Test(a[i],s[i],m[i]));
			//System.out.println(ll1);
			
			
		}		
			}
	
	
		public void listIterator1() {
		ListIterator litr=ll1.listIterator();
		
		while(litr.hasNext())
		{
			Test l1=(Test) litr.next();
			System.out.println(l1.id+" "+l1.name+" "+l1.Marks);
			
		}
}
				
}
