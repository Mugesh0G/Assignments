package string;
import java.util.*;
public class Endswith {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		String arr[] = string.split(" ");
		int count = 0; int count1 = 0;
		for(int iter=0; iter<arr.length;iter++ ){
			String stng = arr[iter];
			int temp = stng.length()-1;
			if( stng.charAt(temp)=='m'){
				count++;
			}
			else if(stng.charAt(temp)=='n'){
				count1++;
			}
			else{
				continue;
			}
		}
		System.out.println("the Words ending with m is "+count);
		System.out.println("the Words ending with n is "+count1);
	}

}
