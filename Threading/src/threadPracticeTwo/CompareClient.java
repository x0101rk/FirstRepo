package threadPracticeTwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareClient {

	public static void main(String[] args) {
		
		List l = new ArrayList();
		Teacher t1 = new Teacher(13, 3, "funk");
		Teacher t2 = new Teacher(30, 5, "aozo");
		Teacher t3 = new Teacher(20, 2, "fozo");
		Teacher t4 = new Teacher(12, 16, "eBozo");
		Teacher t5 = new Teacher(14, 5, "kozo");
		l.add(t1);
		l.add(t2);
		l.add(t3);
		l.add(t4);
		l.add(t5);
		
		Collections.reverse(l);
		System.out.println(l);
		Collections.sort(l, new TeacherIdSort());
		
		System.out.println(l);
		
		Collections.sort(l, new TeacherNameSort());
		Collections.reverse(l);
		System.out.println(l);
		
	}
}
