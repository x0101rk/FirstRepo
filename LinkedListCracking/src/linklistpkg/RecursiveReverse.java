package linklistpkg;

public class RecursiveReverse {

	
	public static void main(String[] args) {
		String str = "increasingly";
		System.out.println(reverseString(str));
		int[] a = {20,100};
		int[] b = {50,150};
		int[] c = findRanges(a, b);
		System.out.println(c[0]+ " " + c[1]);
	}
	
	public static int[] findRanges(int[] a, int[] b){
		int[] back = new int[2];
		if(b[0] <= a[1] && a[1] <= b[1] ){
			back[0] = b[0];
			back[1] = a[1];
		}
		
		return back;
	}
	
  

	public static String reverseString(String str) {
		if (null == str || str.length() <= 1) {
			return str;
		}
		return reverseString(str.substring(1)) + str.charAt(0);
	}
}
