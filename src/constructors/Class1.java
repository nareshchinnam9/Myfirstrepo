package constructors;

public class Class1 {
	
	int x=100;
	
	
	//Default constructor
	/*
	 * public Class1() { System.out.println("This is default constructor"); }
	 */
	
	/*
	 * public Class1(int x) { this.x=x;
	 * System.out.println("This is parameter constructor"); }
	 */
	
	public void sample() {
		
		System.out.println("This is parent class method");
	}
	public static void main(String[] args) {
		
		for(int i=0;i<=10;i++) {
			
			Class1 obj= new Class1();
			//System.out.println(obj.x);
		}
		
		
	}

}
