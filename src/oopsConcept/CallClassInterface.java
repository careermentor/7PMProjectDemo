package oopsConcept;

public class CallClassInterface implements Interface1 //extends Class1 
{

	
	public void method2() {
		
		System.out.println("this is interface method");
		
	}

	
	
	
	/*
	
	public void method1() {
		
		System.out.println("this is abstract class method");
		
	}
	
	*/
	
	public static void main(String[] args) {
		CallClassInterface ci = new CallClassInterface();
		ci.method2();
	}

}
