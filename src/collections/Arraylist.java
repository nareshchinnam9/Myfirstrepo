package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist {
	
	int id;
	String name;
	char sex;
	long mob;
	
	/*
	 * class Studdata{
	 * 
	int id; String name; char sex; long mob;
	 */
	Arraylist(int id,String name,char sex,long mob){
			
			this.id=id;
			this.name=name;
			this.sex=sex;
			this.mob=mob;
		}
		
			
	public static void main(String[] args) {
		
		
		int[] id= {1,2,3,4};
		String [] name= {"Naresh","Prathyusha","Dhruthika","Ammu"};
		char [] sex= {'M','F','F','F'};
		long [] mob= {9845456566l,5454654645646l,454568741633l,981416325566l};
		//List list = new ArrayList();
		ArrayList list1 = new ArrayList();
	
		/*
		 * for(int i=0;i<4;i++) { list.add(new Arraylist(id[i],name[i],sex[i],mob[i]));
		 * }
		 * 
		 * 
		 * 
		 * Iterator<Arraylist> itr=list.iterator(); while(itr.hasNext()) {
		 * 
		 * Arraylist a1=itr.next();
		 * System.out.println(a1.id+" "+a1.name+" "+a1.sex+" "+a1.mob);
		 * 
		 * }
		 */
	
			for(int i=0;i<4;i++)
			{
							list1.add(new Arraylist(id[i],name[i],sex[i],mob[i]));
			}
			
			
			
				Iterator<Arraylist> itr1=list1.iterator();
				while(itr1.hasNext()) {
					
					Arraylist a1=itr1.next();
					System.out.println(a1.id+" "+a1.name+" "+a1.sex+" "+a1.mob);
					
				}
		
		
		System.out.println(list1);
	
	
	
	
	
	
	
	}
	
		
	
}