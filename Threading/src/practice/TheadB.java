package practice;

public class TheadB extends Thread {

	int count = 0;

	synchronized public void run() {
		System.out.println("Thread b begins... ");
		for (int i = 0; i < 10; i++) {
			count +=i;
		}
		System.out.println("Thead b finishes execution and now notifying main...");
		this.notify();
	}
}

/* Some collections allow Duplication
 * Ordering
 * null values
 * Sorting
 * Synchronized
 * 
 * All collections provide the following 
 * size, is empty, add,addall, remove, removeall, contians, contains all , iterator, obj[] toArray()
 * 
 * There are three direct subclasses, 
 * list, set and queue
 * */
