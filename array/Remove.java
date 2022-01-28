package array;
import java.util.*;
public class Remove {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("how many numbers do you want to enter: ");
		int index = scanner.nextInt();
		System.out.println("enter the numbers");
		int array[] = new int[index];
		int array1[]= new int[index];
		
		for(int cc=0;cc<array.length;cc++){
			array[cc] = scanner.nextInt();
		}
		System.out.println("which element do you want to remove");
		int userValue = scanner.nextInt();
		for(int cc=0;cc<array.length;cc++){
			if(array[cc]!=userValue){
			array1[cc]=array[cc];
			System.out.println(array1[cc]);
			}
			else{
				continue;
			}
		}


	}

}
