package inheritance;
interface commites{
	
	public void hello(int x);
}
interface committes{
	
	public void hello(int x);
}
class Single{
	
	public void Hello(int a){	try{
		if(a>5);
		System.out.println("this is first class");
	}
	
	catch(Exception e){
		System.out.println("perform valid action with :"+a);
	}
	}
}
class Single1 extends Single implements commites,committes{
	public void Hello(int x){
		System.out.println("this is inherited class");
	}
	
	public void hello(int a){
		
		System.out.println("this is interface of value "+a);
	}
	 public void hello(int a,int y){
		System.out.println("this is interface 2 with value "+y);
	}
	
}

public class SingleInheritance {
	

	public static void main(String[] args) {
		Single1 obj = new Single1();
		obj.Hello(2);
		obj.hello(6);
		obj.Hello(6);
		obj.hello(1,5);

	}

}
