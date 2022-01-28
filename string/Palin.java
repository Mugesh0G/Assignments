package string;
import java.util.*;
public class Palin {
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	String string = scanner.nextLine() ;
	int Boolean = 0;
	int j=string.length()-1;
	for(int i=0; i<string.length(); i++,j--){
		
		if(j>=0){
			
			if(string.charAt(i)==string.charAt(j)){
				Boolean = 0;
				
			}
			else{
				Boolean = 1;
				break;
			}
			
		}
	}
if(Boolean==0){
System.out.println("This string is an palindrome"); 
}	
else{
	System.out.println("this is not an palindrome");
}
}
}
