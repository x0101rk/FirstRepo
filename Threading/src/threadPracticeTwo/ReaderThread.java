package threadPracticeTwo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class ReaderThread implements Runnable {

	private HashMap<Integer, Employee> emp;
	public ReaderThread(HashMap<Integer, Employee> emp){
		this.emp = emp;
	}
	
	public void run() {
		for (Entry<Integer, Employee> entry : emp.entrySet()) {
		    String key = entry.getKey().toString();
		    Employee value = entry.getValue();
		    System.out.println("key, " + key + " value " + value);
		}
	}

}
