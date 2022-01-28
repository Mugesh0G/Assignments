package string;

import java.util.*;

public class Remove {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your string");		//Get user value,initialize variable.
		String string1  =scanner.nextLine();
		String string = string1.toLowerCase();
		String test = new String();
		
		for(int i=0; i<string.length();i++){
			char Char = string.charAt(i);		//Runs to get  non duplicate character present in string.
		if(test.indexOf(Char)==-1){
			test += Char;
		}
}
		System.out.println(test);
}
}