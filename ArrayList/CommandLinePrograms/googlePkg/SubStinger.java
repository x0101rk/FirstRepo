package googlePkg;

public class SubStinger {

	public static void main(String args[]) {
		SubStinger.subst("abcabcabcabc");

	}

	public static void subst(String s) {
		String tempString[] = new String[s.length()];
		int i = 1;
		tempString[0] = s.substring(0, 1);
		while (i < s.length()) {
			tempString[i] = tempString[i - 1].concat(s.substring(i, i + 1));
			i++;
		}
		int count = 0;
		int tem = 0;

		for (int j = 0; j < tempString.length; j++) {
			// System.out.println(tempString[j]);
			int z = tempString[j].length();
			int k = 0;
			System.out.println("testing for : " + tempString[j]);
			while (!(k + z > s.length())) {
				System.out.println("Comparing "+" "+tempString[j]+" and "+s.substring(k, k + z)+": "+tempString[j].equals(s.substring(k, k + z)));
				if (tempString[j].equals(s.substring(k, k + z))) {					
					System.out.println("The count for " + tempString[j] + " "
							+ ++count);
				}
				else{
					break;
				}
				k+=z;
			}
			if(tem < count)
			tem = count;
			System.out.println("Current count for temp : "+tem);
			count = 0;
		}

		int tlen = 0;
		int mlen = 0;

		// System.out.println(mlen);
	}
}
