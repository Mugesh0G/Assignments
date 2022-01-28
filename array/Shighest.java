package array;

import java.util.*;

public class Shighest {
	public static void main(String[] args){
		
	Scanner scanner = new Scanner(System.in);
	System.out.print("enter how many numbers want to enter : ");
	int index = scanner.nextInt();
	int array[] = new int[index];
	System.out.println("enter your numbers");
	
	for(int ctr=0;ctr<array.length;ctr++){
		array[ctr] = scanner.nextInt();
	}
	for(int i=0;i<array.length;i++){
		for(int j = i+1;j<array.length;j++){
			int temp = 0;
			if(array[j]<array[i]){
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
	}
	System.out.println();
	System.out.println(array[array.length-2]+" is the second highest number in the array"  );
}
}