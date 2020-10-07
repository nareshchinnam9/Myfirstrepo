package OOPS;

public class ClassVariables {
	
	static String s="Naresh";
	static int a=25;
	

	public static void main(String[] args) {		
		
		System.out.println(a);
		ClassVariables cv=new ClassVariables();
		classv();
		System.out.println(cv.a);
		//System.out.println(c);
		

	}
	
	public static void classv() {
		a=30;
		//int c=15;
		System.out.println(a);
		System.out.println(s);
	}

}
