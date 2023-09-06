package oopsConcept;

public class SecondClass extends MyClass
{

	
	public void method1() 
	{
		System.out.println("this is method1");
		System.out.println("this is password");
		
	}

	
	public void method2() 
	{
	
		System.out.println("this is method2");
		System.out.println("this is username");
	}

	public static void main(String[] args) {
		
		SecondClass sc = new SecondClass();
		sc.printmethod();
		sc.method1();
		sc.method2();
	}
	
	
}
