package Inheritance;

public class ClassA extends ClassGptoClassA {
	
	private double empSal;
	public String empDesignation;
	protected String empDOB;
	int empYOE;
	
	public static void main(String[] args) {
		
		
		
	}
	
	public void test5() {
		ClassC obj=new ClassC();
		obj.test4();
	}
	
	/*
	 * public double getEmpSal() {
	 * 
	 * return empSal;
	 * 
	 * 
	 * }
	 * 
	 * public double setEmpsal(double d) {
	 * 
	 * empSal=d; return empSal;
	 * 
	 * }
	 * 
	 * private void test() { System.out.println("Testing private method"); }
	 * 
	 * public void test1() { test(); }
	 * 
	 * public void test2() {
	 * 
	 * System.out.println("This is testing overrding method -- Parent");
	 * 
	 * 
	 * }
	 */
	
	protected double test6(int a,int b) {
			double c= a*b;
			return c;
	}
	
	public void test7() {
		System.out.println("This is a static method of parent class");
	}
}
