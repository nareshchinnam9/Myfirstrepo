package OOPS;

public class CallByValAndCallByRef {
	
	int i=50;
	int j=20;

	public static void main(String[] args) {
		
		CallByValAndCallByRef call=new CallByValAndCallByRef();
		int a=10;
		int b=20;
		int c=call.callByval(a, b);//call by value. Copy of a and b will be passed to x and y
		System.out.println(c);
		
		call.callByRef(call);//call  by reference
		System.out.println(call.i+""+call.j);
		System.out.println(call.j);

	}
	
	
	
	public int callByval(int x,int y) {		
		return x+y;
	}
	
	public void callByRef(CallByValAndCallByRef t) {
		int temp;
		temp=i;
		i=j;
		j=temp;
		
	}
	

}
