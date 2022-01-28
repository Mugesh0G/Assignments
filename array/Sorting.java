package array;
import java.util.*;
public class Sorting {
public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	int index = scanner.nextInt();
	int array[] = new int[index];
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
		System.out.println(array[i] + " ");
	}
		 Arrays.sort(array);
	System.out.println(Arrays.toString(array));
}
}
