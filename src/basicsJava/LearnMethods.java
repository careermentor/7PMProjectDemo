package basicsJava;

public class LearnMethods 
{

	int i = 20;  //global variable
	
	public void value()
	{
		final int i = 30;  //local variable  // constant
		//i=40;
		
		System.out.println(i);  //30/40
	}
	
	public void globalvalue()
	{
		System.out.println(i); //20
		
	}
	
	//methods can take argument/parameter and also methods return value
	//constructor also can take argument/parameter and constructor never return value
	
	public float sum()  //method without parameter/argument
	{

		float a = 20.5f;
		int b = 30;
		
		
		
		float c = a+b;
		System.out.println("sum of a&b: " + c);
		
		return c;
	}
	
	public int addition(int a, int b)  //method with parameters/arguments
	{
		int c = a+b;
		System.out.println("addition of a&b: " + c);
		
		return c;
		
	}
	
	//20+50
	//20+50+40
	
	public LearnMethods()   //no parameter/arugment
	{
		
		
		int a = 20;
		int b = 30;
		int c = a*b;
		
		System.out.println("this is a constructor");
		System.out.println("valud of c is multiplcation: " + c);
		System.out.println("a" + b);
		
		
	}
	
	public LearnMethods(int a, int b)
	{
		int c = a-b;
		System.out.println("subs of a&b: " + c);
	}
	

	public static void main(String[] args) 
	{
	
		LearnMethods lm = new LearnMethods();  // whenever create object of the class constructor will be called automatically
		
		LearnMethods lm1 = new LearnMethods(50,30); 
		
		lm.value();
		lm.globalvalue();
		
		float y = lm.sum(); //50
		
		lm.addition(50, 100);
		lm.addition(400, 500);
		
		int x = lm.addition(20, 50);
		
		
		lm.addition(x, 40);
		
		
		
		
	}
	
}
