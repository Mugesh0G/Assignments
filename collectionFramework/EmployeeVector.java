package collectionFramework;

import java.util.*;


public class EmployeeVector {
	
	static Vector<String>employe = new Vector<>();
	static Vector<Integer>eCode = new Vector<>();
	static Vector<String>showPaySlip = new Vector<>();
	
	
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
		for(int loop = 0; loop<eCode.size();loop++){
			if(ecode==eCode.get(loop))
			{
				eCode.remove(loop);
				employe.remove(loop);
				showPaySlip.remove(loop);
				
			}
		}
		
		
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
			new EmployeeVector().addEmployee(loop);			
		}
		System.out.println(employe);
		System.out.println("--------------------------------");
		
		System.out.println("enter eCode to delete employee profile");
		int profile = sc.nextInt();
		new EmployeeVector().deleteEmployee(profile);
		System.out.println(employe);
		System.out.println("--------------------------------");
		
		
		System.out.println("list of all employee is");
		new EmployeeVector().listAll();
		System.out.println("--------------------------------");
		
		

	}

}



