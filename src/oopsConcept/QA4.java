package oopsConcept;

public class QA4 extends QA2 implements QA3I   //inheritance (QA2- child class can inherit QA1 is parent class)
{
	
	public void div(int a, int b)  //passing parameter/argument
	{
		int c = a/b;
		System.out.println("divition of a&b: " + c);
	}
	
	
	public static void main(String[] args) 
	{
	
		QA4 q3 = new QA4();  //object of the class
		
		q3.sum(20, 30);
		q3.sum(50, 100);
		//q3.subs(40, 30);
		//q3.mul(20, 30);
		
		//QA1 q12 = new QA1();
		//q12.sum(50, 100);
		
	}


	
	public void MQ3i() {
		System.out.println("this is interface Q3I");
		
	}


	
	public void MQA1i() {
	
		System.out.println("QA1I");
		
	}
	
}
