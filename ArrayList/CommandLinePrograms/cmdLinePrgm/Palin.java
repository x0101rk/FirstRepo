package cmdLinePrgm;

public class Palin {
 
	public static void main(String[] args) {
		int digit = 242, temp, rev = 0, num;
		/*temp = digit;*/
		while(digit > 0){
			num = digit % 10; // 
			rev = rev * 10 + num;
			digit/=10;
		}
		System.out.println(rev);
		System.out.println(digit);
		System.out.println("Is Palindrome? : " + (rev == digit));
	}
 
}
