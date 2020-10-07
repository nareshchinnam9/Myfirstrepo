package abstractClass;

public class AbstractClassChild1 extends AbstractClassPractice{

	@Override
	public void test1() {
		
		System.out.println("This is test1 without any arguments");
		
	}

	@Override
	public int test1(int a, int b) {
		System.out.println("This is test method which return int a +b");
		return a+b;
	}

	@Override
	public double test1(double a, double b) {
		System.out.println("This is test1 method which return double a-b");
		
		return a-b;
	}

	@Override
	public String test1(String a, String b) {
		System.out.println("This is test1 method which return string a +b");
		
		return a+b;
	}

}
