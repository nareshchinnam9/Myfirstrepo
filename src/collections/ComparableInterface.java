package collections;

public class ComparableInterface implements Comparable<ComparableInterface> {
	public int id;
	public String name;
	
	public ComparableInterface(int id,String name) {
		this.id=id;
		this.name=name;
		
	}
	
	
	@Override
	/*
	 * public int compareTo(ComparableInterface o) { return id-o.id; }
	 */
	
	public int compareTo(ComparableInterface o) {
		return name.compareTo(o.name);
	}

	
	
}
