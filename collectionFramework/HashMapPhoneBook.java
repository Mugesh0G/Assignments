package collectionFramework;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapPhoneBook {

	public static void main(String[] args) {
		
		HashMap<String,Long> phoneBook = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("how many details want to save");
		int count = scan.nextInt();
		
		
		System.out.println("enter name and phonenumber");
		for(int loop = 0;loop<count;loop++)
		{
			String name = scan.next();
			long num=scan.nextLong();
			phoneBook.put(name,num );
		}
		
		System.out.println("enter name to get phonenumber");
		String name1 = scan.next();
		String name = name1.toLowerCase();
		
		System.out.println(phoneBook.get(name));

	}

}
