package logicBasic;

public class StartRepeat {

	public static void main(String[] args) {
		String star = "*";
		int n = 5;
		/*for (int j = 0; j < n - 1; j++) {
			for (int i = 0; i < j; i++) {
				star = star + "*";
				System.out.println(star);
			}
		}*/
		for(int i =0; i <=n-1; i++ ){
			System.out.println(starRepeater(i, star));
		}		

	}

	static String starRepeater(int n, String str) {
		if (n == 0) {
			return str;
		} else {
			return str + starRepeater(n - 1, str) ;
		}
	}
}
