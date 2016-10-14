package Set;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {

		/*
		 * int[] present = new int[100]; present[0] = 1; present[6] = 7;
		 * present[99] = 100; for (int i = 0; i < 100; i++) { if (present[i] ==
		 * 0) { System.out.println(i + 1); } }
		 */

		Set<Integer> motherSet = new HashSet<Integer>();
		Set<Integer> missingSet = new HashSet<Integer>();
		missingSet.add(2);
		missingSet.add(24);
		missingSet.add(12);
		missingSet.add(34);

		for (int i = 1; i <= 100; i++) {
			motherSet.add(i);
		}
		Set<Integer> result = new HashSet<Integer>(motherSet);
		result.removeAll(missingSet);
		System.out.println(result);
	}

}
