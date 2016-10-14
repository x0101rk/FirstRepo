package arrayPractice;

import java.util.ArrayList;
import java.util.List;

public class SecondMax {

	public static void main(String[] args) {
		int[] a = { 10, 5, 7, 8, 6, 4 };
		int max = 0, secondMax = 0, pos = 0;
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
				pos = i;
			}
			if (secondMax < a[i] && pos != i) {
				secondMax = i;
			}
		}
		System.out.print("Max: " + pos + "\nSecond Max: " + a[secondMax-1]);
		List<Integer> aList = new ArrayList<Integer>();
		aList.add(10);
		aList.add(5);
		aList.add(7);
		aList.add(8);
		aList.add(6);
		aList.add(4);
		
		System.out.println("Second Max: "+findSecondMax(aList));
	}
	
	public static int findSecondMax(List<Integer> a){
		Integer[] iArray = a.toArray(new Integer[a.size()]);
		for(Integer k : iArray){
			System.out.print(k);
		}
		int max = 0, secondMax = 0, pos = 0;
		for (int i = 0; i < iArray.length; i++) {
			if (max < iArray[i]) {
				max = iArray[i];
				pos = i;
			}
			if (secondMax < iArray[i] && pos != i) {
				secondMax = i;
			}
		}
		return iArray[secondMax-1];
	}
	
}
