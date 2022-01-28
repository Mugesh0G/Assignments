package collectionFramework;
import java.util.*;


public class EmployeeHashset {

	public static void main(String[] args) {
		
		HashSet <String> employeeName = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("how many employee name want to add");
		int count = sc.nextInt();
		
		System.out.println("enter employee names");
		for(int loop=0;loop<count;loop++)
		{
			employeeName.add(sc.next());
		}
		

		
		Iterator loop = employeeName.iterator();
		
		while(loop.hasNext())
		{
			System.out.print(loop.next()+" ");
		}

	}

}
