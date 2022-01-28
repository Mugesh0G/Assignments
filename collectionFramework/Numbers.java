package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Numbers {
	
	private static void printAll(ArrayList<Double> array1)
	{
		Iterator iter = array1.iterator();
		while(iter.hasNext())
		{
			
			System.out.print(iter.next()+" ");
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Double>array = new ArrayList<Double>(); 
		
		System.out.println("enter how many numbers to enter");
		int count = sc.nextInt();
		
		System.out.println("enter your number");
		
		for(int iter=0;iter<count;iter++)
		{
			
			array.add(sc.nextDouble());
		}
		
		printAll(array);

	}

}
