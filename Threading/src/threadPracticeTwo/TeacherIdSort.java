package threadPracticeTwo;

import java.util.Comparator;

public class TeacherIdSort implements Comparator {

	public int compare(Object arg0, Object arg1) {
		Teacher t1 = (Teacher)arg0;
		Teacher t2 = (Teacher)arg1;
		
		Integer idRef1 = t1.getId();
		Integer idRef2 = t2.getId();
		
		return idRef1.compareTo(idRef2);
	}

}
