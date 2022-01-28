package javaOne;
import java.util.*;
import java.util.function.*;

public class PredicateSimple {

	public static void main(String[] args) {

		
		Predicate<String> neww = x -> x.equalsIgnoreCase("a");
		System.out.println(neww.test("A"));

		
	}

}
