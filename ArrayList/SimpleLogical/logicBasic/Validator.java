package logicBasic;

public class Validator {

	public static void main(String[] args) {
		A a = new B();
		int i = 2;
		a.calc(i);
		validate(a);
	}
	
	public static void validate(B b){
		System.out.print("B");
	}
	
	public static void validate(A a) {
		System.out.println("A");
	}
	
	public static void validate(Object o){
		System.out.println("O");
	}
	
}
