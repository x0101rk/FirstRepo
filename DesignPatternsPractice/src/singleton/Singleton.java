package singleton;

import java.io.ObjectStreamException;

public class Singleton {

	private static Singleton singletonInstance = null;

	private Singleton() {
		if (singletonInstance != null) {
			throw new RuntimeException("Reflections are not allowed, use factory method getSingletonInstance() method");
		}
		System.out.println("Creating ..");
	}

	public static Singleton getSingletonInstance() {
		if (singletonInstance == null) {
			singletonInstance = new Singleton();
		}
		return singletonInstance;
	}
	private Object readResolve() throws ObjectStreamException {
		System.out.println(".. read resolve");
		return singletonInstance;		
	}
}
