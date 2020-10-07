
public class PrimitiveDataTypes {
	
	public static void avg(int [] array) {
		float avg;
		int i;
		float sum=0;
		for (i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		avg=sum/array.length;
		double precision = 1e-10;

		int rounded = Math.round(avg);
		if (Math.abs(avg-rounded) > precision) System.out.print(avg);
		else System.out.print(rounded);
				
		//return  avg;
			}
	
	public static void middleString(String s) {
		String middle="";
		if (s.length()/2==0){
			for(int i=0;i<=s.length();i++) {
				if (i==(s.length()/2)-1 &&i==(s.length()/2)) {
					middle= middle+i;
					System.out.print(middle);
					
				}
			}
			
		}
		
		
	}

	public static void main(String[] args) {
		
	//PrimitiveDataTypes s=new PrimitiveDataTypes();
	
	int [] array1= {10,5,3,5,7,3};
	avg(array1);
	middleString("1024");
		
	}

}
