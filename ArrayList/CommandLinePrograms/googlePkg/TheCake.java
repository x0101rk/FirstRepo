package googlePkg;

public class TheCake {

	public static void main(String args[]) {
		System.out.println(TheCake.answer("aabaab"));
	}

	public static int answer(String s) {
		if (s.length() > 200 || s == null || s == "")
			return 1;
		boolean check = true;
		for (int m = 0; m < s.length(); m++) {
			if ((int) s.charAt(m) < 97 || (int) s.charAt(m) > 122) {
				check = false;
			}
		}
		if (check != false) {
			String suffix[] = new String[s.length()];
			int i = 1;
			suffix[0] = s.substring(0, 1);
			while (i < s.length()) {
				suffix[i] = suffix[i - 1].concat(s.substring(i, i + 1));
				i++;
			}
			int count = 0;
			int cut = 0;

			for (int j = 0; j < suffix.length; j++) {
				int suffixLength = suffix[j].length();
				int index = 0;
				while (!(index + suffixLength > s.length())) {
					if (suffix[j].equals(s.substring(index, index
							+ suffixLength))
							&& (s.length() % suffix[j].length() == 0)) {
						++count;
					} else {
						break;
					}
					index += suffixLength;
				}

				if ((cut < count) && (s.length() % suffix[j].length() == 0)
						&& (suffix[j].length() > 1)) {
					cut = count;
				}
				count = 0;
			}

			return cut;
		}
		return 1;
	}
}
