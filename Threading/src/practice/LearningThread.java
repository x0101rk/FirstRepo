package practice;

public class LearningThread {

	// The Runnable interface has only one method
	/*
	 * If our class implements runnable interface then
	 * our class becomes a thread class. Hence the runnable is a marker interface
	 * 
		
*/	
	
	public static void main(String[] args) throws InterruptedException {
		ClientThreader ct = new ClientThreader();
		Thread t = new Thread(new MyRunner(ct,"ONE"));
		Thread t2 = new Thread(new SecondRunner(ct,"TWO"));		
		t.start();
		t2.start();
		/*for(int i=0; i< 100; i++){
			System.out.println("main");
		}
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}*/
	}

}
