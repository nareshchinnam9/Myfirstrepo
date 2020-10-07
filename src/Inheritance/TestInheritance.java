package Inheritance;

public class TestInheritance {

	public static void main(String[] args) {
		
		ClassB TI=new ClassB();
		ClassA TI1=new ClassA();
		int a=TI.a1(30, 10);
		System.out.println(a);
		TI.GP();
		TI.a2();
		TI.a3();
		int b=TI1.a1(30, 10);
		System.out.println(b);
		TI1.a2();
		TI1.GP();
		//TI1.a3;// Child class method can't be accessed through parent class object
		
		//Top casting. Child class object is referred by parent class reference variable
		ClassA TI2=new ClassB();//Dynamic polymorphism
		
		TI2.a1(10, 20);
		TI2.a2();
		//TI2.a3; we can't access child class method through parent class reference variable

		//Down casting. Parent class object is referred by child class object
		//ClassB TI4=new ClassA();If you directly trying to access parent class object 
		//using child class reference variable then java gives complile time error
		
		// To avoid this we need to do casting as mentioned below
		ClassB TI4=(ClassB) new ClassA();
		//Even after executing the above statement java run time gives the below error.
		//Exception in thread "main" java.lang.ClassCastException: Inheritance.ClassA cannot be cast to Inheritance.ClassB
		//at Inheritance.TestInheritance.main(TestInheritance.java:32)

	
	
	}

}
