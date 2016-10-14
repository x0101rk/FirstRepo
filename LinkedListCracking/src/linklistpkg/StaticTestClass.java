package linklistpkg;

public class StaticTestClass {

	public static void main(String[] args) {
		Employee bob = new Employee("Bob", 20000);
		System.out.println("Before increment : " + bob.getSalary());
		increment(bob);
		System.out.println("After increment : " + bob.getSalary());
		
	}

	private static void increment(Employee bob) {
		bob.raiseSalary(10);
	}
}
