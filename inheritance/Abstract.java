package inheritance;

abstract class welcome {
	public  void hello2(){
		System.out.println("im from abstract");
	}
	abstract void wel();
	
}
interface test{
abstract   void hello();
}
interface test1{
	public static void hello1(int a){
		System.out.println("im from interface 1");
	}
}
/*interface test12 extends test1{
	public static void hello1(){
		System.out.println("im from interface 2");
	}
	public static void hello1(int a){
		System.out.println("im from interface 2");
	}
	
}
interface test13 extends test12{
	public static void hello1(){
		System.out.println("im from interface 3 ");
	}
}
interface test4 extends test13 {
	public static void hello1(){
		System.out.println("im from interface 4");
	}
}*/
 class hii extends welcome implements test,test1{
	 public void hello(){
		 System.out.println("hii");
	 }
	 public void wel(){
		 System.out.println("hiii");
	 }
	 
	
}
	
public class Abstract extends welcome implements test,test1 {
	
	public void hello() {
		System.out.println("hello");
		
	}
	public void wel(){
		System.out.println("hellooo");
	}
	
	public static void main(String[] args) {
		
		
		Abstract obj = new Abstract();
		hii obj1 = new hii();
		
		
		obj.hello();
		obj1.hello();
		obj.hello2();
		
		
	
		
	}

	

}
