package string;

import java.util.*;

public class Maxi {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		String string1  =scanner.nextLine();			
		String string = string1.toLowerCase();	//Get user value,initialize variable.
		String test = "";
	
		for(int i=0; i<string.length();i++){
			char Char = string.charAt(i);	//Runs to get how many non duplicate character present in string.
		if(test.indexOf(Char)==-1){
			test += Char;
	}
		}
	for(int j=0;j<test.length();j++){
		int count=0;
		for(int k=0; k<string.length();k++){
			if(test.charAt(j)==string.charAt(k)){	//Runs to get count of each and every character
				count++;
			}
			else{
				continue;
			}
		}
	System.out.println("There are "+count+" no of "+test.charAt(j)+" in the string");
	}
		
}
}