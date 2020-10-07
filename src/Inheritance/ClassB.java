package Inheritance;

public class ClassB extends ClassA{
	
	
	public void test3() {
		
		System.out.println("This is testing overrding method -- Child");
		
		
	}
	
	protected double test6(int a,int b) {
		double c= a/b;
		return c;
}

	public void test7() {
	System.out.println("This is a  method of child class");
}
	
}
