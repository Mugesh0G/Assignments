/*
 * 							Average of n Numbers
 * code Description:
 * 		This code is going to get n number from user to get how many numbers they want 
 *to find average, the number are stored in array.
 *		It going to run a for loop to get the numbers and add each and every number 
 *enter into array from for loop and stored in array.
 *		Then average formula written in type of float dataType and printing float variable
 *to print the average of n numbers.
 *		
 * 
 * 
 */


package array;
import java.util.*;
public class Average {
public static void main(String[] args){
	
	Scanner scanner =new Scanner(System.in);
	
	System.out.print("Enter how many numbers do you want to find average :");
	
	int index = scanner.nextInt(); // Getting n numbers to store.
	
	System.out.println("Enter your numbers ");
	float sum = 0;
	int array[] = new int[index];
	for(int i=0;i<array.length;i++)
	{
		array[i] = scanner.nextInt(); // get n number from user by running for loop for get n numbers.
		sum += array[i]; //sum the numbers by user entered number and stored in array 
	}
	float average = sum / array.length; // average formula stored in float dataType in name of variable average
	System.out.println("Your Average is " + average); //printing the average
}
}
