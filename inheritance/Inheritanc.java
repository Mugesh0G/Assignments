package inheritance;

import static org.junit.Assert.*;

import org.junit.*;
import java.io.*;

public class Inheritanc {
	int a=15;
	int b=20;
	int c=0;


	@Test
	public void test() {
		 c = a+b;
		assertEquals(35,c);
		
	}
	@Before
	public void hello(){
		assertNotEquals(a,c);
	}
	@After
	public void hai(){
		assertTrue(a+b==c);
	}
	
	{
	InputStreamReader heh = new InputStreamReader(System.in);
	
	BufferedReader hah = new BufferedReader(heh);
	try{
	String input = hah.readLine();
	System.out.println(input);
	int x =Integer.parseInt(hah.readLine());
	System.out.println(x);
	
	}
	catch(Exception e){
		System.out.println("error");
	}
	}
}
