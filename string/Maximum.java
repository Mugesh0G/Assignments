package string;
import java.lang.reflect.Array;
import java.util.*;
public class Maximum {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		String string1  =scanner.nextLine();
		String string = string1.toLowerCase();		//Get user value,initialize variable.
		String test = "";

	int pos = 0;
	
		for(int i=0; i<string.length();i++){
			char Char = string.charAt(i);		//Runs to get how many non duplicate character present in string.
		if(test.indexOf(Char)==-1){
			test += Char;
	}
		}
		int arr[] = new int[test.length()];
	for(int j=0;j<test.length();j++){
		int count=0;				//Runs to get count of each and every character and stored in array.
		for(int k=0; k<string.length();k++){
			if(test.charAt(j)==string.charAt(k)){
				count++;
			}
			else{
				continue;
			}
		}
		
		arr[j] = count;
	}
	int arr1[] = arr.clone();
	Arrays.sort(arr1);			//Runs to get position of maximum time present character.
	for(int l=0;l<arr.length;l++){
		if(arr1[arr1.length-1] == arr[l]){
		pos = l;
			
		}
		
	}
		System.out.println(test.charAt(pos)+" is maximum time ("+arr1[arr1.length-1]+" Times) Available in the given string");
	
	}
	
}