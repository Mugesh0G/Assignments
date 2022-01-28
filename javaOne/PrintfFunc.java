package javaOne;

import java.util.*;

public class PrintfFunc extends Exception {

	public static void main(String[] args)  {
		
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("mani");
		array.add("subu");
		array.add("sithin");
		array.remove("mani");
		array.add("arun");
		array.add("krish");
		
		Iterator iter = array.iterator();
		try{
		for(int i=0; iter.hasNext();i++){
			
			System.out.printf("%-2d %s \n",i+1,array.get(i));
		}
		}
		catch(Exception x){
			
			
		}
		}
		
	

	}


