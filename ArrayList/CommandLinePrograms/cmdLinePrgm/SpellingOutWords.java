package cmdLinePrgm;

public class SpellingOutWords {
	public static void main(String[] args) {
		int num , reverse = 0, digit;
		num = Integer.parseInt(args[0]);
		for(;num>0;num/=10){
			digit = num %10;
			reverse = reverse * 10 + digit;
		}
		for(;reverse>0;reverse/=10){
			digit = reverse%10;
			switch(digit){
			case 0:
				System.out.println("Zero");
				break;
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Six");
				break;
			case 7:
				System.out.println("Seven");
				break;
			case 8:
				System.out.println("Eight");
				break;
			case 9:
				System.out.println("Nine");
				break;
			}
		}
	}
}
