package linklistpkg;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

	public static void main(String[] args) {
		Map<String, Integer> stringInteger = new HashMap<String, Integer>();
		
		String[] sArray = {"One","Two","One","Two","Three","ONE","One","Two","One","Two","Three","ONE",
				"One","Two","One","Two","Three","ONE","One","Two","One","Two","Three","ONE"};
		//System.out.println(sArray.length);
		for(String s : sArray){
			Integer count = stringInteger.get(s);
			stringInteger.put(s, (count == null) ? 1 : count+1);
		}
		
		System.out.println(stringInteger.entrySet());
				
	}
}
