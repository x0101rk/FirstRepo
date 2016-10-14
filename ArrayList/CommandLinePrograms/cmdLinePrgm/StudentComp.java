package cmdLinePrgm;

public class StudentComp implements Comparable{

	int id;
	String name;
	
	StudentComp(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	public int compareTo(Object o) {
		StudentComp sc = null;
		if(o == null){
			throw new NullPointerException();
		}
		if(!(o instanceof StudentComp)){
			throw new ClassCastException();
		}
		sc = (StudentComp)o;
		if(this.id < sc.id)
			return -1;
		else if(this.id > sc.id)
			return 1;
		else 
			return 0;		
	}

}
