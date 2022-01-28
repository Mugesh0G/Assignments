package javaOne;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;




interface example
{
	 public abstract void  hello(); 
}

class Execute  
{
	public void test(){
		System.out.println("i'm test method from class Execute");
	}
}


public class FunctionalInterface  {

	public static void main(String[] args) {
		
		//int arr[] = {1,2,3,4,5,600,7,8,90,1000};
		
//		Predicate<String>predi= s -> s.equalsIgnoreCase("hello");
//		
//		System.out.println(predi.test("Hello"));
//		
//		Predicate<Integer>predicate= s -> (s>=0&&s<100);
		
//		Predicate<Integer>predicate1= s -> (s>=100&&s<200);
//		
//		for(int i : arr)
//		{
//			if(predicate.or(predicate1).test(i))
//			{
//				System.out.println(i + " passed");
//			}
//			else{
//				System.out.println(i+" not passed");
//			}
		
	
//	}
//		 int d = 1;
//		
//		Function<Integer,Double> func = z -> 0.02;
//		
//		Function<Double,String> func1 = f -> "mugesh";
//		
//		System.out.println(func.andThen(func1).apply(d));
//		System.out.println(func1.compose(func).apply(d));
//		
		
//		Consumer <Integer> cons = s -> System.out.println(" hello");
//		Consumer <Integer> cons1 = s -> System.out.print("welcome");
//		cons1.andThen(cons).accept(10);
		
//		Supplier<String>suply = () -> "hello";
//		System.out.println(suply.get());
	
		
		Execute obj = new Execute();
		example obj1 = obj::test;
		obj1.hello();
		
		

}
}
