package polymorphism;

public class Base {

	public static void test(){
		System.out.println("Base class..");
	}
	
	public final void iStance(){
		System.out.println("Instance");
		test();
	}
	
	public static void bark(){
		System.out.print("Woof!");
	}
	
	
}
