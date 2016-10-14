package threadPracticeTwo;

import java.util.Comparator;

public class TeacherNameSort implements Comparator {

	public int compare(Object arg0, Object arg1) {
		Teacher t1 = (Teacher)arg0;
		Teacher t2 = (Teacher)arg1;
		
		String idRef1 = t1.getName();
		String idRef2 = t2.getName();
		
		return idRef1.compareTo(idRef2);
	}

}
