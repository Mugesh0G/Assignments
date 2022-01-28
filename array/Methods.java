package array;
import java.util.*;
public class Methods {
	public static int array[];
	
	public static void getArray(int num1){
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter how many numbers want to enter : ");
		int index = scanner.nextInt();
		 array = new int[index];
		System.out.println("enter your numbers");
		
		for(int ctr=0;ctr<array.length;ctr++){
			array[ctr] = scanner.nextInt();
		}
	}
	
	public static void display(int num1){
		if(array == null){
			System.out.println("you are not created an array");
			getArray(num1);	
		}
	
		for(int ctr=0;ctr<array.length;ctr++){
			System.out.print(array[ctr]+" ");
		
		}
	}
	
	public static void search(int num1){
		
		if(array == null){
			System.out.println("you are not created an array");
			getArray(num1);	
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your value to search");
		int userValue = sc.nextInt();
		boolean found = false;
		int cc=0;
		
		for(;cc<array.length;cc++){
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
	
	
	public static void sorting(int num1){
		
		if(array == null){
			System.out.println("you are not created an array");
			getArray(num1);	
		}
		
		System.out.println("your sorted array is ");
		for(int i=0;i<array.length;i++){
			for(int j = i+1;j<array.length;j++){
				int temp = 0;
				if(array[j]<array[i]){
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
			System.out.println(array[i] + " ");
		}
	}
	

	public static void main(String[] args) {
		
	for(int ctr=0;ctr<1000;ctr++){
	Scanner scanner = new Scanner(System.in);
	System.out.println("To create an array enter 1");
	System.out.println("To display an array enter 2");
	System.out.println("To search an element in array enter 3");
	System.out.println("To sort an array enter 4");
	System.out.println("To end your function enter 5");
	int num1 = scanner.nextInt();
	
	switch(num1){
	
	case(1):
		getArray(num1);
	    continue;

	case(2):
		display(num1);
	    continue;
	case(3):
		search(num1);
		continue;
		
	case(4):
		sorting(num1);
		continue;
		
	case(5):
		System.out.println("Thank You :) ");
	break;
	default:
		System.out.println("Enter correct option to perform");
		System.out.println();
		continue;
	}	
	break;
		
	}

}
}
