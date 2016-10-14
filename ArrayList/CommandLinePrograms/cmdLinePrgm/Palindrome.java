package cmdLinePrgm;

public class Palindrome {
	public static void main(String[] args) {
		int num = 282,revNum = 0,digit;
		int temp = num;
		while(num >0){
			digit= num%10;
			revNum = revNum * 10 + digit;
			num /= 10;
		}
		if(revNum == temp){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Nope");
		}
	}
}
