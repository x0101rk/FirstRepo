package cmdLinePrgm;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListMerger {

	public static void main(String[] args) {
		List<String> aList = new LinkedList<String>();
		List<String> bList = new LinkedList<String>();
		
		aList.add("One");
		aList.add("Three");
		aList.add("Five");
		aList.add("Seven");
		
		bList.add("Two");
		bList.add("Four");
		bList.add("Six");
		bList.add("Eight");
		
		ListIterator<String> aIter = aList.listIterator();
		Iterator<String> bIter = bList.iterator();
		
		while(bIter.hasNext()){
			if(aIter.hasNext()) aIter.next();
			aIter.add(bIter.next());
		}
		
		System.out.println(aList);
		
		// remove every second element from the list
		bIter = bList.iterator();
		while(bIter.hasNext()){
			bIter.next();
			if(bIter.hasNext()){
				bIter.next();
				bIter.remove();
			}
		}
		System.out.println(bList);
		
		aList.removeAll(bList);
		
		System.out.println(aList);
	}
}
