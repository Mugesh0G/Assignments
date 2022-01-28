package string;
 
import java.util.*;

public class Duplictae {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your string");
		String string1 = scanner.nextLine();
		String string = string1.toLowerCase();
		String test = new String();
		int count =0;
		
		for(int i=0; i<string.length();i++){
			 
			char ch = string.charAt(i);
			
				for(int j=0; j<test.length(); j++){
					if(test.charAt(j) == ch){
						count = 1;
					}
					
					else{
						count = 0;	
					}
				}
			
		if(count == 1){
			continue;
		}
		
		else{
			test += ch;
		}
	}
		System.out.println(test);
}
}