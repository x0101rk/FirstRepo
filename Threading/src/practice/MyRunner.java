package practice;

public class MyRunner implements Runnable {
	
	
	private ClientThreader client;
	private String s;
	public MyRunner(ClientThreader client, String s){
		this.setClient(client);
		this.s = s;
	}
	public ClientThreader getClient() {
		return client;
	}
	public void setClient(ClientThreader client) {
		this.client = client;
	}
	public void run() {
		Thread.currentThread().setName("First Runner");
		client.disp(s);
		/*for(int i=0;i<1000;i++){
			getClient().count();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
	}


}
