package basicsJava;

public class FirstProgram 
{
	
	//data type (information)
	
	String Name = "Java";
	char test1 = 'A';
	int exp = 17;
	float sum = 12.5f;
	boolean x = true;
	
	public void printdata()
	{
		System.out.println(Name);
		System.out.println(test1);
		System.out.println(exp);
		System.out.println(sum);
		System.out.println(x);
	}
	
	
	public static void main(String[] args) 
	{
		
		FirstProgram abc = new FirstProgram();  //object of the class
		abc.printdata();
		
		int a = 30;
		System.out.println(a);
		
		System.out.println("this is main method");
		
		LearnMethods lm = new LearnMethods();
		lm.addition(40, 50);
	}
	
	
	
}