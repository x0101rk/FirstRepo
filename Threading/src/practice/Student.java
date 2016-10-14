package practice;

public class Student implements Comparable {
	
	String name;
	Integer id;
	
	public Student(String name, Integer id){
		this.name = name;
		this.id = id;
	}
	// In comparable we have to override compareToMethod
	public int compareTo(Object obj) {
		Student sRef = (Student)obj;		
		return name.compareTo(sRef.name);
	}
	
	@Override
	public String toString(){
		return this.name + " " + this.id;
	}
}
