package practice;

public class SecondRunner implements Runnable {

	private ClientThreader client;
	private String s;
	public SecondRunner(ClientThreader client, String s){
		setClient(client);
		setS(s);
	}
	
	public void run() {
		client.disp(s);
		/*for(int i=0;i<1000;i++){
			Thread.currentThread().setName("Second Runner");
			getClient().count();
			
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
	}

	public ClientThreader getClient() {
		return client;
	}

	public void setClient(ClientThreader client) {
		this.client = client;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

}
