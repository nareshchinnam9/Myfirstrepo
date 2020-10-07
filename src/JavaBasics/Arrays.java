package JavaBasics;

public class Arrays {
	
	

	public static void main(String[] args) {
	
		String [] a=new String[5];
		int[] [] a1=new int[3][4];
			for(int i=0;i<a1.length;i++) {
				for(int j=0;j<a1[i].length;j++) {
					a1[i][j]=(int)(Math.random()*100);
				System.out.print(a1[i][j]+" ");		
				}
				System.out.println();
				}
			
		a[0]="5";
		a[1]="7";
		a[2]="11";
		a[3]="17";
		a[4]="13";
		//System.out.println(a);
		Arrays obj=new Arrays();
		int sum=obj.arraysum(a);
		int sum1=obj.arraysum(a1);
		System.out.println(sum);
		
		
	
		System.out.println(sum1);
		
	}
	
		public int arraysum(String[] a ) {
			int sum=0;
			for(int i=0;i<a.length;i++) {
				int j;
				j=Integer.parseInt(a[i]);
				sum=sum+j;
							}
			return sum;

}
	
	public int arraysum(int[][] a ) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for (int j=0;j<a[i].length;j++) {
				sum=sum+a[i][j];
			}
				
			}
			
		return sum;

}
}
