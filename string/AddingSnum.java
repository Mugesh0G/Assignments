package string;

import java.util.*;
public class AddingSnum {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		String arr[] = string.split(" ");
		String s1 = "";
		int value =0;
		
		for(int i=0;i<arr.length;i++){
			
			String s2 = arr[i];
			for(int j=0; j<s2.length();j++){
				
			if(s2.charAt(j)>= '0' && s2.charAt(j) <= '9'){
			s1 =s1+s2.charAt(j);
			}
			else{
				
				if(s1!=""){
					value+=Integer.parseInt(s1);
					s1 ="";
			}
			}
			
			}	
		}
		value +=Integer.parseInt(s1);
		System.out.println(value);
}
}