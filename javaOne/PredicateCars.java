package javaOne;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateCars {
	 String companyName;
	 String model;
	 Integer Release;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getRelease() {
		return Release;
	}

	public void setRelease(Integer release) {
		Release = release;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<PredicateCars> cars = new ArrayList<PredicateCars>();
		
		//Object created
		PredicateCars input = new PredicateCars();
		PredicateCars input1 = new PredicateCars();
		PredicateCars input2 = new PredicateCars();
		
		//initialize the values
		
		input.setCompanyName("BMW");
		input.setModel("Sclass");
		input.setRelease(2020);
		
		input1.setCompanyName("Audi");
		input1.setModel("A3");
		input1.setRelease(2019);
		
		input2.setCompanyName("MG");
		input2.setModel("Hector");
		input2.setRelease(2018);
		
		
		//adding to ArrayList
		
		cars.add(input);
		cars.add(input1);
		cars.add(input2);
		
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int xe = sc.nextInt();
		Result(cars, p ->p.getCompanyName().equalsIgnoreCase(s1));
		Result(cars,x->x.getModel().equalsIgnoreCase(s2));
		Result(cars,y->y.getRelease()==xe);
		
		Predicate <String> xg = x->"hello".length()==10;
		System.out.println(xg.test(s1));
		
		
	}
	public static void Result(ArrayList<PredicateCars>cars,Predicate<PredicateCars>PrediResult){
		for(PredicateCars hello : cars){
			if(PrediResult.test(hello)){
				System.out.println(hello.getModel()+ " "+hello.getRelease());
			}
			
			
		}
		
		
	}

}
