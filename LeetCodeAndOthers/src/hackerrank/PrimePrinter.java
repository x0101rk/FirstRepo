package hackerrank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PrimePrinter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		int max = 0;
		int temp = 0;

		long[] n = new long[q];
		for (int i = 0; i < q; i++) {
			n[i] = sc.nextLong();
			// PrintPrime(sc.nextLong());
		}

		for (int k = 0; k < n.length; k++) {
			PrimeNumberGenerator(n[k]);
			/*for(int j = 1; j <= n[k] ; j++){
				temp = PrintPrime(j);
				if(max < temp){
					max = temp;
				}
			}
			System.out.println(max);*/
		}
		

		sc.close();

	}

	public static int PrintPrime(long number) {

		HashSet<Integer> prime = new HashSet<Integer>();
	//	System.out.println(number);
		for (int i = 2; i <=(number); i++) {
			if (number % i == 0) {
				prime.add(i);
				number /= i;
				i--;
			}
		}
	//	System.out.println(prime);
		return prime.size();
	}
	
	public static void PrimeNumberGenerator(long n){
		Set<Long> primeSet = new TreeSet<Long>();
		
		boolean prime[] = new boolean[(int) (n+1)];
        for(int i=0;i<n;i++)
            prime[i] = true;
         
        for(int p = 2; p*p <=n; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p] == true)
            {
                // Update all multiples of p
                for(int i = p*2; i <= n; i += p)
                    prime[i] = false;
            }
        }
         
        // Print all prime numbers
        for(int i = 2; i <= n; i++)
        {
            if(prime[i] == true)
                System.out.println(i + " ");
        }
		
	}
}
