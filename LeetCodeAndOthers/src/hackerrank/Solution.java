package hackerrank;


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t = 5;
        int n = 0;
        int k = 0;
        
        for(int i = 1; i <= t; i++){
            System.out.println(t);
            n = randomWithinRange(0,200);
            k = randomWithinRange(0,200);
            System.out.println(n + " " + k);
            for(int j = 0; j < n ; j++ ){
               System.out.print(randomWithinRange((int)Math.pow(10,-3), (int)Math.pow(10,3)));
                System.out.print(" ");
            }
        }
        
        
    }
    
    static int randomWithinRange(int max, int min){
        int range = (max - min) + 1;     
        return (int)(Math.random() * range) + min;
    }
    
}
