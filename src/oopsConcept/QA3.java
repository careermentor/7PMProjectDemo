package oopsConcept;

public class QA3 extends QA1   //inheritance (QA2- child class can inherit QA1 is parent class)
{
	
	public void mul(int a, int b)  //passing parameter/argument
	{
		int c = a*b;
		System.out.println("multiplication of a&b: " + c);
	}
	
	
	public static void main(String[] args) 
	{
	
		QA3 q3 = new QA3();  //object of the class
		
		q3.sum(20, 30);
		q3.sum(50, 100);
		//q3.subs(40, 30);
		q3.mul(20, 30);
		
		//QA1 q12 = new QA1();
		//q12.sum(50, 100);
		
	}
	
}
