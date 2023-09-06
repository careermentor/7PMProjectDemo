package oopsConcept;

public class QA2 extends QA1   //inheritance (QA2- child class can inherit QA1 is parent class)
{
	
int x = 30;
	
	public void printvalue()
	{
		
		int x = 40;
		System.out.println(x);  //40
		System.out.println(this.x); //30
		System.out.println(super.x); //20
		
		super.sum(20, 30);
	}
	
	public void sum(int a, int b)  //passing parameter/argument
	{
		int c = a*a+b*b;
		System.out.println("sum of a*a & b*b: " + c);
		
		System.out.println("statement" );
		System.out.println(c);
		
	}
	
	public void subs(int a, int b)  //passing parameter/argument
	{
		int c = a-b;
		System.out.println("substraction of a&b: " + c);
	}
	
	
	public static void main(String[] args) 
	{
	
		QA2 q2 = new QA2();  //object of the class
		
		q2.sum(20, 30);  //20+30 = 50, 20*20+30*30 = 1300
		q2.sum(50, 100);
		q2.subs(40, 30);
		
		q2.printvalue();
		
		
		//QA1 q12 = new QA1();
		//q12.sum(50, 100);
		
	}


	public void MQA1i() {
System.out.println("QA1I");

		
	}
	
}
