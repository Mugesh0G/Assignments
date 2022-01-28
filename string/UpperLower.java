package string;

import java.util.*;

public class UpperLower {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your string");		//Get user value,initialize variable.
		String string = scanner.nextLine();
		
		for(int i=0;i<1000;i++){						
			
		System.out.println("to convert uppercase enter 1");
		System.out.println("to conver lowercase enter 2 ");
		System.out.println("to complete your function enter 3");
		int num = scanner.nextInt();
		
		 switch(num){
		 
		 case(1):
			 System.out.println(string.toUpperCase());
		 	continue;
		 case(2):
			 System.out.println(string.toLowerCase());
		 	continue;
		 case(3):
			 System.out.println(" Thankyou :) ");
		 break;
			 default:
			 System.out.println("your input is wrong");
			 continue;
		 }
		 break;
		}		 
		 
			 
		
	}
}
