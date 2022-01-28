package collectionFramework;
import java.util.*;


public class ColectionTreeSet   {

	public static void main(String[] args) {
		
		TreeSet<String>employeeNames = new TreeSet<>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter how many names want to add");
		int count = scan.nextInt();
		
		System.out.println("enter your names");
		for(int loop=0; loop<count; loop++)
		{
			employeeNames.add(scan.next());
		}
		
	System.out.println(employeeNames);
		
		System.out.println("enter the name to search");
		String name = scan.next();
		
		Iterator loop = employeeNames.iterator();
		int find =0;
		
		
		while(loop.hasNext())
		{
			String temp = (String)loop.next();
			if(name.equals(temp))
					{
						find = 1;
						break;
					}
				
		}
		
		if(find==1){
			System.out.println(name);
		}
		else{
			System.out.println("not found");
		}
		
		Iterator loop2 = employeeNames.descendingIterator();
		
		while(loop2.hasNext())
		{
			System.out.print(loop2.next()+" ");
		}
	

	}

}
