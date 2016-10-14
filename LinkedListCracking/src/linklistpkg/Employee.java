package linklistpkg;

public class Employee {

	private String name;
	private double salary;

	public Employee(String n, double d) {
		this.setSalary(d);
		this.setName(n);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void raiseSalary(double percentage){
		double raise = salary * percentage / 100;
		salary += raise;
	}

}
