package polymorphism;

public class SubclassB extends Base {

	static int local = 22;
	
	public static void main(String[] args) {
	
		Base b = new Base();
		Base c = new SubclassC();
		Base d = new SubclassB();
		
		
		b.bark();
		c.bark();
		d.bark();
		SubclassB.bark();
	}
	
	public static void test(){
		System.out.print("Subclass..");
	}
	
	public static void bark(){
		System.out.print("Sub Bark!");
	}
	
	
	static class Zeta implements PolyImpl{

		public void printerme() {
			System.out.print(local);	
		}	
		
	}
}
