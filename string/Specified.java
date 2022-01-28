package string;
import java.util.*;
public class Specified {
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter your Sentences");
	String string = scanner.nextLine();
	int count = 0;
	for(int i=0; i<string.length();i++){
		
		if(string.charAt(i) == '#'){
			if(i>0 && i<string.length()-2){
		if(string.charAt(i-1) == string.charAt(i+1)){
			
			count = 1;
		}
		else{
			count =0;
		}
		
		}
		}
	}

	if(count == 1){
		System.out.println("the before and after character is same ");
	}
	else if(count == 0){
		System.out.println("the before and after character is not same");
	}
	else{
		System.out.println("there is no special character");
	}
	
}}

