package inheritance;
import java.util.*;

class Account{
	
	 public static void calculateIntrest(double amnt,double intrest,int days){
		 
		 double value = amnt*intrest*days/days;
		 System.out.println("Intrest Gained: "+value);
}
}


class SB {
	public void SBaccount(double amnt)throws Exception{
		if(amnt>0){
		Scanner sc = new Scanner(System.in);
		System.out.println("Type your account type: Normal or NRI");
		String type = sc.nextLine();
	if(type.equalsIgnoreCase("normal")){
		Account.calculateIntrest(amnt, 0.04, 365);
	}
	else if(type.equalsIgnoreCase("nri")){
		Account.calculateIntrest(amnt, 0.06, 365);
	}
	else{
		throw new Exception();
	}
	}
		else{
			throw new Exception();
		}
	
	}
}



class FD extends SB{
	
	public void FDaccount(double amnt,int day,int age)throws Exception{
		
		if(amnt>0&&age>0&&day>0){
		if(amnt<10000000){
		if(age>60){
			
			if(day>7&&day<=14){
				Account.calculateIntrest(amnt, 0.05, day);
			}
			else if(day>15&&day<=29){
				Account.calculateIntrest(amnt, 0.0525, day);
			}
			else if(day>30&&day<=45){
				Account.calculateIntrest(amnt, 0.06, day);
			}
			else if(day>45&&day<=60){
				Account.calculateIntrest(amnt, 0.0750, day);
			}
			else if(day>61&&day<=184){
				Account.calculateIntrest(amnt, 0.08, day);
			}
			else if(day>184&&day<=365){
				Account.calculateIntrest(amnt, 0.0850, day);
			}
			else{
				System.out.println("You're reached max.no of days");
				System.out.print("your Final ");
				Account.calculateIntrest(amnt, 0.0850, day);
			}
		}
		else{
			if(day>7&&day<=14){
				Account.calculateIntrest(amnt, 0.0450, day);
			}
			else if(day>15&&day<=29){
				Account.calculateIntrest(amnt, 0.0475, day);
			}
			else if(day>30&&day<=45){
				Account.calculateIntrest(amnt, 0.0550, day);
			}
			else if(day>45&&day<=60){
				Account.calculateIntrest(amnt, 0.07, day);
			}
			else if(day>61&&day<=184){
				Account.calculateIntrest(amnt, 0.0750, day);
			}
			else if(day>184&&day<=365){
				Account.calculateIntrest(amnt, 0.08, day);
			}
			else{
				System.out.println("You're reached max.no of days");
				System.out.print("your Final ");
				Account.calculateIntrest(amnt, 0.08, day);
			}
		
		
	}
	
		}
		else{
			if(day>7&&day<=14){
				Account.calculateIntrest(amnt, 0.0650, day);
			}
			else if(day>15&&day<=29){
				Account.calculateIntrest(amnt, 0.0675, day);
			}
			else if(day>30&&day<=45){
				Account.calculateIntrest(amnt, 0.0675, day);
			}
			else if(day>45&&day<=60){
				Account.calculateIntrest(amnt, 0.08, day);
			}
			else if(day>61&&day<=184){
				Account.calculateIntrest(amnt, 0.0850, day);
			}
			else if(day>184&&day<=365){
				Account.calculateIntrest(amnt, 0.1, day);
			}
			else{
				System.out.println("You're reached max.no of days");
				System.out.print("your Final ");
				Account.calculateIntrest(amnt, 0.1, day);
			}
			
		}
	}
		else{
			throw new Exception();
		}
}
}



class RD extends FD{
	
	public void RDaccount(double amnt,int day,int age) throws Exception{
		if(amnt>0&&age>0&&day>0){
		if(age>60){
			if(day<=183){
				Account.calculateIntrest(amnt, 0.08, day);
			}
			else if(day>183&&day<=275){
				Account.calculateIntrest(amnt, 0.0825, day);
			}
			else if(day>275&&day<=365){
				Account.calculateIntrest(amnt, 0.0850, day);
			}
			else if(day>365&&day<=456){
				Account.calculateIntrest(amnt, 0.0875, day);
			}
			else if(day>456&&day<=546){
				Account.calculateIntrest(amnt, 0.09, day);
			}
			else if (day>546&&day<=637){
				Account.calculateIntrest(amnt, 0.0925, day);
			}
			else{
				System.out.println("You're reached max.no of days");
				System.out.print("your Final ");
				Account.calculateIntrest(amnt, 0.0925, day);
			}
		}
		else{
			if(day<=183){
				Account.calculateIntrest(amnt, 0.0750, day);
			}
			else if(day>183&&day<=275){
				Account.calculateIntrest(amnt, 0.0775, day);
			}
			else if(day>275&&day<=365){
				Account.calculateIntrest(amnt, 0.08, day);
			}
			else if(day>365&&day<=456){
				Account.calculateIntrest(amnt, 0.0825, day);
			}
			else if(day>456&&day<=546){
				Account.calculateIntrest(amnt, 0.0850, day);
			}
			else if (day>546&&day<=637){
				Account.calculateIntrest(amnt, 0.0875, day);
			}
			else{
				System.out.println("You're reached max.no of days");
				System.out.print("your Final ");
				Account.calculateIntrest(amnt, 0.0875, day);
			}
			
		}
		}
		else{
			throw new Exception();
		}
		
	}
	
}
	


public class IntrestCalculator extends Exception {
	public static void main(String[] args){
	
		for(int i=0;i<1000;i++){
		Scanner sc = new Scanner(System.in);
		System.out.println(" Select the option : ");
		System.out.println();
		System.out.println("   1. Intrest Calculator - SB");
		System.out.println("   2. Intrest Calculator - FD");
		System.out.println("   3. Intrest Calculator - RD");
		System.out.println("   4. To End ");
		System.out.println();
		try{
			
		int x = sc.nextInt();
		
		
		RD fetch = new RD();
		
						
		switch(x){
		
		case(1):
			System.out.println("Enter 'SB-Account' Amount");
			
			try{
			double amount = sc.nextInt();
			fetch.SBaccount(amount);
			}
			catch(Exception sb){
				System.out.println("---Enter Your Valid Input---");
				System.out.println();
			}
			continue;
		
		case(2):
			try{
			System.out.print("Enter FD Amount: ");
			double amountFD = sc.nextInt();
			System.out.print("Enter no of days: ");
			int days = sc.nextInt();
			System.out.println("Enter your Age");
			int age = sc.nextInt();
			fetch.FDaccount(amountFD,days,age);
			}
			catch(Exception ab){
				System.out.println("---Enter Your Valid Input---");
				System.out.println();
			}
			continue;
			
		case(3):
			try{
			System.out.print("Enter RD Amount: ");
			double amountRD = sc.nextInt();
			System.out.print("Enter no of days: ");
			int day = sc.nextInt();
			System.out.println("Enter your Age");
			int ag = sc.nextInt();
			
			fetch.RDaccount(amountRD,day,ag);
			}
			catch(Exception ab){
				System.out.println("---Enter Your Valid Input---");
				System.out.println();
			}
			continue;
			
		case(4):
			System.out.println("        -----------------------------------");
			System.out.println("                    ThankYou :) ");
			System.out.println("        -----------------------------------");
			break;
			default:
				System.out.println("Enter your input between given option");
				System.out.println();
				continue;
		
	}
		}
		catch(Exception xx){
			System.out.println("-----Enter Your Valid Input(Only in Numbers)------");
			System.out.println();
			continue;
		}
		break;
		}
		
	}

}
