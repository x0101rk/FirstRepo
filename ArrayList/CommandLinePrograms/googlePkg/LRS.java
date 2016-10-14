package googlePkg;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LRS {

	
	
	// return the longest common prefix of s and t
	public static String lcp(String s, String t) {
		int n = Math.min(s.length(), t.length());
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) != t.charAt(i))
				return s.substring(0, i);
		}
		return s.substring(0, n);
	}

	// return the longest repeated string in s
	public static String lrs(String s) {

		// form the N suffixes
		int n = s.length();
		String[] suffixes = new String[n];
		Set<String> stringSet = new HashSet<String>();
		for (int i = 0; i < n; i++) {
			//stringSet.add(s.substring(i, n));
			suffixes[i] = s.substring(i, n);
		}

		
		// sort them
		Arrays.sort(suffixes);;
//		for(String k : suffixes){System.out.println(k);};

		// find longest repeated substring by comparing adjacent sorted suffixes
		String lrs = "";
		/*for (int i = 0; i < n - 1; i++) {
			String x = lcp(suffixes[i], suffixes[i + 1]);
			if (x.length() > lrs.length())
				lrs = x;
		}*/
		
	
		
		
		int cnt = 0;
		int sum = 0;
		for(String sub : stringSet){
			String newString = s.replace(sub,"");
			cnt = (s.length()- newString.length()/sub.length());
			if (cnt > sum){
				sum = cnt;
			}
		}
		
		System.out.println(cnt);

	//	System.out.println(countRepeat(lrs, s));
	//	System.out.println(lrs);
		return lrs;
	}

	private static int countRepeat(String lrs, String s) {
		int count = 0;
		int lastIndex = 0;

		while (lastIndex != -1) {
			lastIndex = s.indexOf(lrs, lastIndex);
			if (lastIndex != -1) {
				count++;
				lastIndex += lrs.length();
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		System.out.println(lrs("abcabc"));
	/*	int lo = calc("abccbaabccba", 0);
		System.out.println(lo);*/
	}
}
