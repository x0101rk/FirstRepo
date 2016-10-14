package threadPracticeTwo;

import java.util.HashMap;

public class WriterThread implements Runnable {

	HashMap<Integer, Employee> emp;
	Employee e1 = new Employee(1, "orak");
	Employee e2 = new Employee(2, "xand");
	Employee e3 = new Employee(3, "frnk");
	Employee e4 = new Employee(4, "mrajnz");
		
	public WriterThread(HashMap<Integer, Employee> emp){
		this.emp = emp;
	}
	public void run() {
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		emp.put(4, e4);			
	}

}
