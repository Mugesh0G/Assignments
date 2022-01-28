package collectionFramework;
import java.util.*;

public class CountryHashSet {
	
	static HashSet <String> countryName = new HashSet<>();
	
	private  HashSet saveCountryName(String Country)
	
	{
		countryName.add(Country);
		return countryName;
	}
	private String getCountryName(String Country)
	{
		Iterator loop = countryName.iterator();
		int find = 0;
		
		while(loop.hasNext())
		{
			if(Country.equalsIgnoreCase((String)loop.next()))
			{
				find =1;
				break;
			}
		}
		if(find==1)
		{
			return Country;
		}
		else{
			return null;
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CountryHashSet call = new CountryHashSet();
		
		System.out.println("how many country name want to save");
		int count = sc.nextInt();
		
		System.out.println("enter your countrynames");
		for(int loop = 0; loop<count;loop++)
		{
			call.saveCountryName(sc.next());
		}
		System.out.println(countryName);
		
		System.out.println("enter your country name to search");
		String country = sc.next();
		System.out.println(call.getCountryName(country));

	}

}
