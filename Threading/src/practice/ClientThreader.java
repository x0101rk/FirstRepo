package practice;

public class ClientThreader {

	private int i;

	public void count() {
		System.out.println("This is the thread: "
				+ Thread.currentThread().getName() + " and the Count is :"
				+ i++);
	}

	synchronized public void disp(String s) {
		System.out.print("[" + s);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print("]");
	}

}
