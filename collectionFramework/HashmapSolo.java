package collectionFramework;import java.util.*;
public class HashmapSolo {
	public static void main(String[] args){
		HashMap <String,Integer> hello = new HashMap<String,Integer>();
		hello.put("hello",21);
		for(int i=0;i<3;i++){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String ar[] = s.split(" ");
		String intt = ar[0];
		int value = Integer.valueOf(ar[1]);
				hello.put(intt, value);
		
		}

		for(Map.Entry<String, Integer>neww : hello.entrySet()){
		int aq = Collections.max(hello.values());
		if(neww.getValue()==aq){
			System.out.println(neww.getKey());
		}
		}
		
		}
	}
