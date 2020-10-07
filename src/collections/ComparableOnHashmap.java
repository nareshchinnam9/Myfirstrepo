package collections;

public class ComparableOnHashmap implements Comparable<ComparableOnHashmap> {
	
	public int id;
	public String name;
	
	public ComparableOnHashmap(int id,String name) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		
	}
	

	@Override
	public int compareTo(ComparableOnHashmap o) {
		// TODO Auto-generated method stub
		return id-o.id;
	}

}
