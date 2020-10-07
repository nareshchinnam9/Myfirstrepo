package constructors;

public class Class2 extends Class1 {
	
	int x=200;

	
	/*
	 * public Class2() {
	 * 
	 * //super(10);
	 * 
	 * System.out.println("This is child class constructor"); }
	 */
	
	
public void sample() {
	
		super.sample();
		
		System.out.println("This is child class method");
		
		
}

public void display() {
	
	System.out.println(super.x);
	System.out.println(x);
}

	public static void main(String[] args) {
		
		Class2 obj= new Class2();
		
	}
	
	
	
}
