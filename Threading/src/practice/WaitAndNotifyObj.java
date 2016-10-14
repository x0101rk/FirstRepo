package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class WaitAndNotifyObj {

	public static void main(String[] args) throws InterruptedException {
		/*Vector v = new Vector();
		v.addElement(1);
		v.insertElementAt(0,1);
		v.insertElementAt(0,2);		
		v.add("hello");
		v.add(null);
		System.out.println(v);*/
		
		List l = new ArrayList();
		
		Student s = new Student("FC", 1);
		Student s1 = new Student("BC", 7);
		Student s2 = new Student("AC", 3);
		Student s3 = new Student("CC", 6);
		
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s);
		
		Collections.sort(l);
		

		System.out.println(l);
		/*TheadB tb = new TheadB();
		tb.start();
		synchronized (tb) {
			System.out.println("Main method begins and class wait()");
			tb.wait(); // Main will wait until notified
			System.out.println("Main thead notified");
			System.out.println("Total: " + tb.count);
		}*/
	}
}
