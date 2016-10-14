package pojo;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Employee{

	String firstName;
	String lastName;
	int id;
	
	public Employee(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName
				+ ", id=" + id + "]";
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	public static void main(String[] args) {
		Employee emp1 = new Employee("1st Name","1 Last Name",1);
		Employee emp2 = new Employee("2 Name","2 Last Name",2);
		Employee emp3 = new Employee("3 Name","3 Last Name",3);
		Employee emp4 = new Employee("4 Name","4 Last Name",4);
		Employee emp5 = new Employee("5 Name","5 Last Name",5);
		Employee emp6 = new Employee("1st Name","1 Last Name",1);
		
		Comparator<Employee> firstNameComparator = new Comparator<Employee>() {

			public int compare(Employee arg0, Employee arg1) {
				// TODO Auto-generated method stub
				
				return arg0.firstName.compareTo(arg1.firstName);
			}
			
		};
		
		String s1 = "Ramakrishna";
		String s2 = "Ramakrishna";
		String s3 = new String("Ramakrishna");
		System.out.println(s1 == s3);
		
		Set<Employee> unique = new LinkedHashSet();
		unique.add(emp1);
		unique.add(emp2);
		unique.add(emp3);
		unique.add(emp4);
		unique.add(emp5);
		unique.add(emp6);
		
		for(Employee e : unique){
			System.out.println(e);
		}
		
		
	}

}
