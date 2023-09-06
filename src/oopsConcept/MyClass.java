package oopsConcept;

public abstract class MyClass     //concrete
{

	int i  =20;
	
	
	public void printmethod()   // concrete method
	{
		int i  =20;
		i=30;
		System.out.println("this is concrete method");
	}
	
	public void printmethod1()   // concrete method
	{
		int i  =20;
		i=30;
		System.out.println("this is concrete method");
	}
	
	public abstract  void method1();
	
	public abstract  void method2();
	
	
	public static void main(String[] args) 
	{
	
	//	MyClass mc = new MyClass();
	//	mc.printmethod();
		
		
	}
	
}
