package oopsConcept;

public class LearnKeywords 
{
	
	static int a = 20;  //global variable
	
	public static void printvalue()
	{
		//final int a = 30; //local variable  //constant
		
		//a = 40;
		
		System.out.println(a); //30 //40
		
		//System.out.println(this.a);  //20
		
	}
	
	public static void main(String[] args)
	{
		//LearnKeywords lw = new LearnKeywords();
		LearnKeywords.printvalue();
	}
	

}
