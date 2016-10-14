package threadPracticeTwo;

public class Teacher {

	private Integer age = 0;
	private String name = null;
	private Integer id = 0;
	
	public Teacher(int age, int id, String name){
		this.age = age;
		this.id = id;
		this.name = name;		
	}
	
	public int getAge(){return this.age;}
	public String getName(){return this.name;}
	public int getId(){return this.id;}
	
	public String toString(){
		return "Name: "+this.getName()+" Id: "+ this.getId() + " Age: " + this.getAge();
	}
}
