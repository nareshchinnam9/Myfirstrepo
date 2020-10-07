package accessModifierspackage1;

import abstractClass.AbstractClassChild1;

public class Test {

	public static void main(String[] args) {
		
		ClassA obj= new ClassA();
		ClassB obj1= new ClassB();
		obj.add();
		obj1.add();
		AbstractClassChild1 ap= new AbstractClassChild1();
		ap.test1();
		ap.test1(10, 20);

	}

}
