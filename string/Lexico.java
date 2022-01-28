package string;

import java.util.*;

public class Lexico {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your string");
		String string = scanner.nextLine();
		String string1 = scanner.nextLine();
		int string3 = string.compareToIgnoreCase(string1);
		if(string3 == 0){
			System.out.println("the given string is same");
		}
		else{
			System.out.println(" the given strings is not same ("+(string3)+" differences )" );
		}
	}

}
