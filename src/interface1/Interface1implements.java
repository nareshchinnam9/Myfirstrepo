package interface1;

public class Interface1implements implements Interface1,Interface2{

	public static int add(int x,int y) {
		int z=x-y;
		return z;
	
	}
	
	public int sub(int x,int y) {
		int z=x-y;
		return z;
		
	}
	public int div(int x,int y) {
		int z=x/y;
		return z;
		
	}
	public int multi(int x,int y) {
		int z= x*y;
		return z;
	}

	public void additional() {
		System.out.println("This is additional method in child class");
	}

}
