package logicBasic;

public class RecursiveAnagram {

	static char[] arrChar = new char[100];
	
	
	
	
	public static void main(String[] args) {
		String anagram ="short";
		for(int i=0;i<anagram.length();i++){
			arrChar[i] = anagram.charAt(i);
		}
		
		int a = 6, b = 0, c;
		
		b = ++a;
		c = b + --a;
		
		System.out.println(c);
		
		doAnagram(anagram.length());
		
		int sum = 0;
		for(int i =0 ; i <= 10; i++ ){
			if(i%2==0){
				sum += i; 
				continue;
			}
			System.out.println(i + "\t");
		}
		
		System.out.println("Sum of the numbers is :" + sum);
	}
	private static void doAnagram(int length) {
		if(length == 1)
			return;
		for(int i =0; i<length; i++){
			doAnagram(length-1);
			if(length == 2)
				display();
			
		}
	}
	
	private static void display() {
		// TODO Auto-generated method stub
		
	}
}