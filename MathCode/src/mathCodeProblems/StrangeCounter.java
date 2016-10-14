package mathCodeProblems;

import java.util.Scanner;

public class StrangeCounter {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.close();
        int num = 3;
        int originalNumber = num;
        int count = 0;
        
        while(true){
            if(num == 1){
                num = (originalNumber -1) * 2;                
            }
            else
            { 
            	count++;
            	if(count == t){
            		System.out.println(num);
            		break;
            	}
                num--;
            }
            
        }
        
        
        
    }
}
