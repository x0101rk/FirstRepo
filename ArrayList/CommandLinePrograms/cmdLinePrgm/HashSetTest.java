package cmdLinePrgm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashSetTest {
 
	public static void main(String[] args) throws FileNotFoundException {
		Set<String> words = new HashSet<String>();
		long totalTime = 0;
		
		Scanner in = new Scanner(new File("texttest.txt"));
		while(in.hasNext()){
			String word = in.next();
			long calltime = System.currentTimeMillis();
			words.add(word);
			calltime = System.currentTimeMillis() - calltime;
			totalTime += calltime;
		}
		
		Iterator<String> it = words.iterator();
		for(int i=0;i<20; i++){
			System.out.println(it.next());			
		}
		System.out.println("...");
		System.out.println(words.size() + " distictwords in " + totalTime + " milliseconds");
		
	}
}
