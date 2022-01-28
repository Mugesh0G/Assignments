package javaOne;
import java.util.*;
//@FunctionalInterface
interface hello{
	abstract public void function1();
	default void function2(){
		System.out.println("this is default msg");
	}

	
}

public class Lamda  {
	public static void main(String[] args){

	hello obj = ()->{
		int a=20;
		System.out.println(a);
		};
	obj.function1();
	obj.function2();
	
}
}
