package interfaceexamples;

public class InterfaceChild implements Interface1,Interface2{

	
	
	
	public static void main(String[] args) {
		
		Interface1 c1=new InterfaceChild();
		
		c1.click();
	

	}


	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("Implementation of default method");
	}




}
