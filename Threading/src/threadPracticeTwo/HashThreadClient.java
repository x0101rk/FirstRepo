package threadPracticeTwo;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class HashThreadClient {

	public static void main(String[] args) {
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		Employee e1 = new Employee(5, "orak");
		Employee e2 = new Employee(6, "xand");
		Employee e3 = new Employee(7, "frnk");
		Employee e4 = new Employee(8, "mrajnz");
		emp.put(5, e1);
		emp.put(6, e2);
		emp.put(7, e3);
		emp.put(8, e4);
		Thread t1 = new Thread(new WriterThread(emp));
		Thread t2 = new Thread(new ReaderThread(emp));
		t1.start();
		t2.start();		
		
		Set keys = emp.keySet();
		
		for (Entry<Integer, Employee> entry : emp.entrySet()) {
		    String key = entry.getKey().toString();
		    Employee value = entry.getValue();
		    System.out.println("key, " + key + " value " + value + "in Main");
		}
		
	}
}
