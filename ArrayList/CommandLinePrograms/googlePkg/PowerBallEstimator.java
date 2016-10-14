package googlePkg;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PowerBallEstimator {

	public static void main(String[] args) {
		System.out.println("Enter Values: ");
		Scanner sc = new Scanner(System.in);
		int[] values = { 1, 8, 10, 7, 8, 6, 7, 2, 7, 9, 12, 11, 5, 6, 6, 9, 6,
				4, 7, 8, 4, 8, 14, 5, 10, 4, 10, 8, 8, 9, 9, 14, 10, 8, 4, 6,
				4, 4, 6, 12, 6, 5, 5, 8, 1, 5, 10, 3, 6, 9, 3, 12, 5, 6, 7, 7,
				8, 4, 8, 8, 7, 11, 8, 15, 7, 8, 10, 9, 13 };
		
		Map<Integer, Integer> sMap = new TreeMap<Integer, Integer>();
		
		for (int i = 0; i < values.length; i++) {
			sMap.put(i + 1, values[i]);
		}		
		sMap = PowerBallEstimator.sortByValue(sMap);
		for (int i : sMap.keySet()) {
			int key = i;
			int value = sMap.get(key);
			System.out.println(key + " : " + value);
		}
		

	}

	public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) 
	{
		List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
			public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		Map<K, V> result = new LinkedHashMap<K, V>();
		for (Map.Entry<K, V> entry : list) {
			result.put(entry.getKey(), entry.getValue());
		}
		return result;
	}
}
