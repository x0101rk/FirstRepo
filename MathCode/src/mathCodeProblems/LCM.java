package mathCodeProblems;

public class LCM {

	public static int LCM = 1;

	public static int findMin(int[] iArray) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < iArray.length; i++) {
			if ((iArray[i] != 1) && (min < iArray[i])) {
				min = iArray[i];
			}
		}
		return min;
	}

	public static int returnDivisibleNumber(int min) {

		if (min == Integer.MAX_VALUE)
			return -1;
		else {
			for (int i = 2; i < min; i++) {
				if (min % i == 0) {
					LCM *= i;
					return i;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
	}

}
