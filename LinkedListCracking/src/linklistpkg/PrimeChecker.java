package linklistpkg;

import java.util.Scanner;

public class PrimeChecker {

	int something = 0;
	static int StaticField = 0; 
	public static void main(String[] args) {

		System.out.println("Prime? "
				+ evalPrime(new Scanner(System.in).nextInt()));
	}

	static boolean evalPrime(int n) {
		if (n < 2)
			return false;
		int sqrt = (int) Math.sqrt(n);
		for (int i = 2; i <= sqrt; i++) {
			if (sqrt % i == 0)
				return false;
		}
		return true;

	}

	public static void isStatic(){
		
	}
	
	public void nonStatic(){
		System.out.println(StaticField *10);
		isStatic();
	}
}
