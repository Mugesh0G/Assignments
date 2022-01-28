package string;

import java.util.HashSet;
import java.util.Scanner;

public class Unique {
	
	public int uniqueVowels(String string)
	
	{
		HashSet<Character>set = new HashSet();
		
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)=='a'||string.charAt(i)=='e'||string.charAt(i)=='i'||string.charAt(i)=='o'||string.charAt(i)=='u')
				{
					set.add(string.charAt(i));
				}
		}
		return set.size();
	}
	
public int uniqueConsonents(String string)
	
	{
		HashSet<Character>set = new HashSet();
		
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)!='a'&&string.charAt(i)!='e'&&string.charAt(i)!='i'&&string.charAt(i)!='o'&&string.charAt(i)!='u'&&string.charAt(i)!=' ')
				{
					set.add(string.charAt(i));
				}
			
		}
		return set.size();
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		String str = sc.nextLine();
		
		Unique obj = new Unique();
		System.out.println(obj.uniqueVowels(str));
		System.out.println(obj.uniqueConsonents(str));
		
	}

}
