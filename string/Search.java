package string;
import java.util.*;
public class Search {
public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter your string");
	String string = scanner.nextLine();
	System.out.println("enter your  string to get count");
	String string1 = scanner.nextLine();
	int j = 0;
	int count,count1;
	count=count1=0;
	for(int i=0;i<string.length();i++){
		 if(string.charAt(i)==string1.charAt(j)){
			 j++;
			 count++;
		 }
		 else{
			 j=0;
			 count=0;
			 
		 }
		 if(count == string1.length()){
			count1++;
			j=0;
			}
		 
	 }
	System.out.println("the string ''"+string1+"'' present in the string "+count1+" times");
	}
	
}

