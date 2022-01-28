package collectionFramework;
import java.util.*;
import java.util.Map.Entry;

public class CollectionHashSet {
	
	HashMap<Integer,String> studentDetails = new HashMap<>();
	
	
	private int findKey(int key)
	{
		int count =0;
		for(Map.Entry<Integer, String> map : studentDetails.entrySet()){
			if(key==map.getKey())
			{
				count = 1;
				break;
			}
		}
		if(count==1)
		{
			return key;
		}
		else{
			return 0;
		}
	}
	
	private String findValue(String Value)
	{
		int count =0;
		for(Map.Entry<Integer, String> map : studentDetails.entrySet()){
			if(Value.equalsIgnoreCase(map.getValue()))
			{
				count = 1;
				break;
			}
		}
		if(count==1)
		{
			return Value;
		}
		else{
			return null;
		}
	}
	
	private void iterate()
	{
		
		
		Iterator<Entry<Integer, String>> loop = studentDetails.entrySet().iterator();
		
		while(loop.hasNext())
		{
			Map.Entry<Integer, String> entry = loop.next();
			System.out.print(entry.getKey()+": ");
			System.out.println(entry.getValue());
		}
		
		
	}
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("how many details want to save");
		int count = scan.nextInt();
		CollectionHashSet call = new CollectionHashSet();
		
		System.out.println("enter key and value");
		for(int loop = 0;loop<count;loop++)
		{
			call.studentDetails.put(scan.nextInt(), scan.next());
		}
		
		System.out.println("enter key value to search");
		int key = scan.nextInt();
		System.out.println(call.findKey(key));
		
		System.out.println("enter value to search");
		String value = scan.next();
		System.out.println(call.findValue(value));
		
		call.iterate();

	}

}
