package collectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class CollectionHashMapIter {

	public static void main(String[] args) {
		
		HashMap<String,String> details = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("how many details want to save");
		int count = scan.nextInt();
		
		
		System.out.println("enter state and capital");
		for(int loop = 0;loop<count;loop++)
		{
			details.put(scan.next(), scan.next());
		}
		
		
	Iterator<Entry<String, String>> loop = details.entrySet().iterator();
		
		while(loop.hasNext())
		{
			Map.Entry<String, String> entry = loop.next();
			System.out.print(entry.getKey()+": ");
			System.out.println(entry.getValue());
		}
		
		

	}

}
