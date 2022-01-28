package collectionFramework;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;



class Employee{
	
	static CopyOnWriteArrayList<String>employe = new CopyOnWriteArrayList<>();
	static CopyOnWriteArrayList<Integer>eCode = new CopyOnWriteArrayList<>();
	static CopyOnWriteArrayList<String>showPaySlip = new CopyOnWriteArrayList<>();
	
	
	private void addEmployee(int e)
	
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.println("enter employee name");
		String name = sc.nextLine();
		employe.add(name);
		
		System.out.println("create employee eCode");
		int num = sc.nextInt();
		eCode.add(num);
		
		System.out.println("create paySlip ");
		String slip = sc.next();
		showPaySlip.add(slip);
		System.out.println();
		
		
		
		
		
	}// method
	
	
	private void deleteEmployee(int ecode)
	{
		int pos = 0;
		Iterator iter = eCode.iterator();
		
		
		
		while(iter.hasNext())
		{
			int code =  (int) iter.next();
			
			
			
			if(code==ecode)
			{
				employe.remove(pos);
				eCode.remove(pos);
				showPaySlip.remove(pos);
			}//if loop
			else
			{
			pos++;	
			}
			
			}// while loop
	
		
		
	}// method
	
	private String showPaySlip(int ecode)
	{
		Iterator iter = eCode.iterator();
		
		int pos = 0;
		String slip = "";
		
		while(iter.hasNext())
		{
			int code = (int) iter.next();
			
			if(code==ecode)
			{
				slip = (String)showPaySlip.get(pos);
			}//if loop
		
		}// while loop
		
		return slip;
	}// method
	
	
	private void listAll()
	{
		System.out.println( employe);
		System.out.println(eCode);
		System.out.println(showPaySlip);
	}
	





	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("how many employee to add");
		int addemp = sc.nextInt();
		
		for(int loop =0; loop<addemp;loop++)
		{
			new Employee().addEmployee(loop);			
		}
		System.out.println(employe);
		System.out.println("--------------------------------");
		
		System.out.println("enter eCode to delete employee profile");
		int profile = sc.nextInt();
		new Employee().deleteEmployee(profile);
		System.out.println(employe);
		System.out.println("--------------------------------");
		
		
		System.out.println("list of all employee is");
		new Employee().listAll();
		System.out.println("--------------------------------");
		
		

	}

}
