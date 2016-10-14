package singleton;

import java.lang.reflect.Constructor;

public class SingletonTestor {

	public static void main(String[] args) throws Exception{
		// Effort to break singleton instance via reflections
		Class cs = Class.forName("singleton.Singleton");
		Constructor<Singleton> ctor = cs.getDeclaredConstructor();
		ctor.setAccessible(true);
		Singleton s3 = ctor.newInstance();
		displaySingltonProperties("s3", s3);		
		
		
		Singleton sI = Singleton.getSingletonInstance();
		Singleton sII = Singleton.getSingletonInstance();
		displaySingltonProperties("sI", sI);
		displaySingltonProperties("sII", sII);
	}
	
	static void displaySingltonProperties(String singletonInstance, Singleton singletonObj){
		System.out.println("Object: " + singletonInstance + " HashCode: " + singletonObj.hashCode());
	};

}
