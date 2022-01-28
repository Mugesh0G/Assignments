package array;
import java.util.*;
public class Copy {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter how many numbers want to enter : ");
		int index = scanner.nextInt();
		int array[] = new int[index];
		int copiedArray[] = new int[index];
		System.out.println("enter your numbers");
		
		for(int ctr=0;ctr<array.length;ctr++){
			array[ctr] = scanner.nextInt();
		}
		for(int ctr=0;ctr<copiedArray.length;ctr++){
			copiedArray[ctr]=array[ctr];
		System.out.print(copiedArray[ctr]+" ");
	}
		}

}
