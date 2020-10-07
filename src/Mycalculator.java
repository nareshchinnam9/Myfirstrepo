
public class Mycalculator {
		
	String s="Naresh";
	int age=35;
	


	public static void main(String[] args) {
		
		Mycalculator obj= new Mycalculator();
		System.out.println("Myname is:"+obj.s+" And my age is:"+obj.age);
		obj.test();
		
	}
	
	public void test() {
		
		System.out.println("Myname is:"+s+" And my age is:"+age);
	}

}
