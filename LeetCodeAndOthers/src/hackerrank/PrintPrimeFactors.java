package hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class PrintPrimeFactors {

	 public static void main(String[] args) {
	        int[] primes = {1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61};
	        BigInteger[] prods = new BigInteger[primes.length];
	        prods[0] = BigInteger.valueOf(1);
	        for (int i = 1; i < primes.length; i++) {
	            prods[i] = prods[i-1].multiply(BigInteger.valueOf(primes[i]));
	        }
	        
	        for(BigInteger b : prods){
	        	System.out.println(b);
	        }
	        
	        Scanner scan = new Scanner(System.in);
	        int q = scan.nextInt();
	        for (int qi = 0; qi < q; qi++) {
	            BigInteger x = scan.nextBigInteger();
	            for (int i = 0; i < prods.length; i++) {
	                if (x.compareTo(prods[i]) < 0) {
	                    System.out.println(i-1);
	                    break;
	                }
	            }
	        }
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	    }
}
