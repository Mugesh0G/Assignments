package collectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class CountryHashTable {
	
	static Hashtable<String,String>CountryMap = new Hashtable<>();
	Hashtable<String,String>reverseCountryMap = new Hashtable<>();
	ArrayList<String>CountryName = new ArrayList<>();
	
	private Hashtable<String,String> saveCountryCapital(String Name,String Capital)
	{
		
		CountryMap.put(Name, Capital);
		return CountryMap;
	}
	
	
	
	private String getCountry(String capitalName )
	{
		String name = "";
		
		for(Map.Entry<String, String> iter : CountryMap.entrySet())
		{
			if(iter.getValue().equalsIgnoreCase(capitalName))
			{
				name = (String) iter.getKey();
			}
		}
		return name;
	}
	
	
	
	private String getCapital(String countryName )
	{
		String name = "";
		
		for(Map.Entry<String, String> iter : CountryMap.entrySet())
		{
			if(iter.getKey().equalsIgnoreCase(countryName))
			{
				name = (String) iter.getValue();
			}
		}
		return name;
	}
	
	
	
	private Hashtable<String,String> reverse()
	{
		for(Map.Entry<String, String> iter : CountryMap.entrySet())
		{
			reverseCountryMap.put(iter.getValue(), iter.getKey());
		}
		return reverseCountryMap;
	}
	
	
	
	private ArrayList<String> storeCapital()
	{
		for(Map.Entry<String, String> iter : CountryMap.entrySet())
		{
			CountryName.add(iter.getKey());
		}
		return CountryName;
	}
	
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of country & capital to save");
		int count = sc.nextInt();
		CountryHashTable call = new CountryHashTable();
		
		for(int loop = 0; loop<count;loop++)
		{
			System.out.println("----------------------------------");
			System.out.println("Enter your Country and their capitalname");
			System.out.println(call.saveCountryCapital(sc.next(),sc.next()));
		}
		
		System.out.println("-------------------------------------");
		System.out.println("enter country name to search capital ");
		System.out.println(call.getCapital(sc.next())+" is the capital for entered country");
		
		System.out.println("-------------------------------------");
		System.out.println("enter capital name to search country ");
		System.out.println(call.getCountry(sc.next())+" is the country for entered capital");
		
		System.out.println("-------------------------------------");
		System.out.println("Reversed HashMap");
		System.out.println(	call.reverse());
		
		System.out.println("-------------------------------------");
		System.out.println("ArrayList stored country from HashMap");
		System.out.println(	call.storeCapital());
		System.out.println("-------------------------------------");
		

	}

}


