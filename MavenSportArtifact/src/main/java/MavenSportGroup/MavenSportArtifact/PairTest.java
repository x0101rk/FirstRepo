package MavenSportGroup.MavenSportArtifact;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class PairTest {

	public static void main(String[] args) {
		String a[] = {"Mary","had","a","little","lamb"};
		Pair<String> p = MinMaxAlgo.minmax(a);
		System.out.println("min : " + p.getFirst());
		System.out.println("max : " + p.getSecond());
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

class someClass<E> implements Queue<E>{

	public boolean addAll(Collection<? extends E> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}

	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean add(E arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public E element() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean offer(E arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}

	public E poll() {
		// TODO Auto-generated method stub
		return null;
	}

	public E remove() {
		// TODO Auto-generated method stub
		return null;
	}
	
}