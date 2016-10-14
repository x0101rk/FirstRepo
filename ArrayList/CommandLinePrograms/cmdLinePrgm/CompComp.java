package cmdLinePrgm;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class CompComp {
	public static void main(String[] args) {
		List alpha = new Vector();
		List beta = new Vector();
		alpha.add(20);
		alpha.add(0);
		alpha.add(12);
		
		Collections.sort(alpha);
		System.out.println(alpha);
		
		StudentComp sc1 = new StudentComp(20, "First");
		StudentComp sc2 = new StudentComp(15, "Ping");
		StudentComp sc3 = new StudentComp(1, "Zang");
		
		beta.add(sc2);
		beta.add(sc1);
		beta.add(sc3);
		
		System.out.println("Before sort");
		Iterator it = beta.iterator();
		while(it.hasNext()){
			StudentComp s = (StudentComp)it.next();
			System.out.println(s.id);
		}
		Collections.sort(beta);
		System.out.println("After sort");
		it = beta.iterator();
		while(it.hasNext()){
			StudentComp s = (StudentComp)it.next();
			System.out.println(s.id);
		}
	}

}
