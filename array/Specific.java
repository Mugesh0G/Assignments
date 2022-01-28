package array;
import java.util.*;
public class Specific {
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.print("how many numbers do you want to enter: ");
	int index = scanner.nextInt();
	boolean found = false;
	int array[] = new int[index];
	for(int cc=0;cc<array.length;cc++){
		array[cc] = scanner.nextInt();
	}
	System.out.println("Enter your value to check:");
	int userValue = scanner.nextInt(); 
	for(int cc=0;cc<array.length;cc++){
		if(array[cc]==userValue){
		found = true;
		break;
		}
		else{
			found = false;
		}
	}
	if(found==true){
		System.out.println("element found");
	}
	else{
		System.out.println("element not found");
	}
	}
		
	}


