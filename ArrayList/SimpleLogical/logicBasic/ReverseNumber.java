package logicBasic;

public class ReverseNumber {

	public static void main(String[] args) {
		int original = 747, remainder = 0, reversed = 0, temp = original; 
		while(original >  0){
			remainder  = original % 10;
			reversed = reversed * 10 + remainder;
			original/=10;
		}
		System.out.println(reversed);
		System.out.println(temp == reversed);
		System.out.println(pow(7, 2));
	}
	
	public static int pow(int base,int pow){
		if (pow == 1)
			return base;
		else
			return base = base * pow(base, pow -1);
	}
	
}
