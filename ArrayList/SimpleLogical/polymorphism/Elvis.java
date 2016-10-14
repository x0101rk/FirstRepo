package polymorphism;

import java.util.Calendar;

public class Elvis {

	public static final Elvis INSTANCE = new Elvis();
	
	private int beltsize = 0;
	
	private static final int CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR);
	
	private Elvis(){
		beltsize = CURRENT_YEAR - 1930; 
	}
	
	public int beltSize(){
		return beltsize;
	}
	
	public static void main(String[] args) {
		System.out.print("Elvis wears size : " + INSTANCE.beltSize());
	}
}
