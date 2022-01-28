/**
 * 
 */
package collectionFramework;
import java.util.*;

public class Strings {

	private static void printAll(ArrayList<String> array1)
	{
		Iterator iter = array1.iterator();
		while(iter.hasNext())
		{
			
			System.out.print(iter.next()+" ");
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String>array = new ArrayList<String>(); 
		
		System.out.println("enter how many names to enter");
		int count = sc.nextInt();
		
		System.out.println("enter your names");
		
		for(int iter=0;iter<count;iter++)
		{
			
			array.add(sc.next());
		}
		
		printAll(array);
		
		
		
	}

}
