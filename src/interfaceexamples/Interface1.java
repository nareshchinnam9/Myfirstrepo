package interfaceexamples;

public interface Interface1 {
	
	default  void click() {
		
		System.out.println("This is static method from parent1");
		
	}
	
	public void test();
	
	public static void main(String[] args) {
		
		System.out.println("This is main method in interface");
	
	
	}

}
