package cmdLinePrgm;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class PairTest {

	public static void main(String[] args) {
		/*String a[] = {"Mary","had","a","little","lamb"};
		Pair<String> p = MinMaxAlgo.minmax(a);
		System.out.println("min : " + p.getFirst());
		System.out.println("max : " + p.getSecond());*/
		
		List<String> llist = new LinkedList<String>();
		llist.add("One");
		llist.add("three");
		llist.add("four");
		ListIterator<String> it = llist.listIterator();
		int count = 0;
		while(count!=2){
			it.next();
			it.add("add");
			count++;
		}
		
		for(String s : llist){
			System.out.println(s);
		}
		System.out.println(llist.toString());
	}	
}

class MinMaxAlgo{
	
	public static Pair<String> minmax(String a[]){
			
		if(a == null || a.length == 0) return null;
		String min = a[0];
		String max = a[0];
		
		for(int i = 1 ; i < a.length; i++){
			if(min.compareTo(a[i]) > 0) min = a[i]; // returns negative if the first comes before second
			if(max.compareTo(a[i]) < 0) max = a[i]; // returns positive if the second comes after first
		}
		
		return new Pair<String>(min, max);
	}
	
	public static <T extends Comparable<T>> T getMin(T[] a){
		if(a == null || a.length == 0) return null;
		T smallest = a[0];
		for(int i=0;i< a.length ; i++){
			if(smallest.compareTo(a[i]) > 0) smallest = a[i];
		}
		return smallest;
	}
}
