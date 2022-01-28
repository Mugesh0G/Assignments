package collectionFramework;
import java.util.*;

public class EmployeeId {


	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer>id = new ArrayList<>();
		ArrayList<String>name = new ArrayList<>();
		ArrayList<String>address = new ArrayList<>();
		ArrayList<Float>salary = new ArrayList<>();
		
		
		System.out.println("how many do you want to save");
		int count = scan.nextInt();
		int count1 = 0;
		
		for(int iter = 1;iter <= count;iter++)
		{
			System.out.print("ID: ");
			id.add(scan.nextInt());
			System.out.print("Name: ");
			name.add(scan.next());
			System.out.print("Address: ");
			address.add(scan.next());
			System.out.print("Salary: ");
			salary.add(scan.nextFloat());
			System.out.println();
		}
		System.out.print("Find: ");
		
		int idy = scan.nextInt();
		
		Iterator iter = id.iterator();
		

		while(iter.hasNext())
		{
			
			int x = (int)iter.next();
			if(x == idy)
			{
				System.out.println("-----------");
				System.out.println("Name: "+name.get(count1));
				System.out.println("Address: "+address.get(count1));
				System.out.println("Salary: "+salary.get(count1));
				System.out.println("-----------");
			}
			else
			{
				count1++;
			}
			
			
		}
		
	}

}
