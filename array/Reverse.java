package array;
import java.util.*;
public class Reverse {
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	System.out.print("how many numbers do you want to enter: ");
	int index = scanner.nextInt();
	System.out.println("enter the numbers");
	int array[] = new int[index];
	for(int cc=0;cc<array.length;cc++){
		array[cc] = scanner.nextInt();
	}
	for(int cc1=array.length-1;cc1>=0;cc1--){
		System.out.print(array[cc1]+" ");
	}
	
}
}
