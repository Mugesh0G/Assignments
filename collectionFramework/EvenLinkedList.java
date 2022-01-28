package collectionFramework;

import java.util.*;

public class EvenLinkedList {

	static LinkedList<Integer> A1 = new LinkedList<>();
	 LinkedList<Integer> A2 = new LinkedList<>();
	
	private  LinkedList<Integer> saveEvenNumbers(int N)
	{
		for(int i=1;i<=N;i++)
		{
			if(i%2==0)
			{
				A1.add(i);
			}
			
		}
		return A1;
		
	}
	
	private  LinkedList<Integer> printEvenNumbers()
	{
		Iterator iter = A1.listIterator();
		
		while(iter.hasNext())
		{
			int x = (int)iter.next();
			int y = x*2;
			A2.add(y);
		
		}
		return A2;
		
		
	}
	private int printEvenNumbers(int N)
	{
		Iterator iterator = A1.iterator();
		
		int check =0;
		while(iterator.hasNext())
		{
			int y = (int) iterator.next();
			if(N==y)
			{
			check = y;
			}
			
		}
		return check;
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter number to store [2 to N]");
		int end = sc.nextInt();
		System.out.println("Even Numbers: "+new EvenLinkedList().saveEvenNumbers(end));
		System.out.println();
		System.out.println("Even Numbers multiply by 2"+new EvenLinkedList().printEvenNumbers());
		
		
		System.out.println("Enter number to check");
		int find = sc.nextInt();
		System.out.println("-----");
		System.out.println(new EvenLinkedList().printEvenNumbers(find));
		System.out.println("-----");
		
		

	}

}