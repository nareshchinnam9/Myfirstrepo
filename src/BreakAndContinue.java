
public class BreakAndContinue {
	static int j=0;

	public static void main(String[] args) {
		
		for(int i=0;i<=10;i++) {
			
			
			if (i==6) {
				continue;
				
			}
			
			System.out.println(i);
			j++;
			
			
		}
		System.out.println("Comes out of for loop when i="+j);

	}

}
