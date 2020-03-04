
import java.util.Scanner;

public class Que1 {

	String name;
	int id;
	double bSal;
	Que1(String name,int id)
	{
		this.name  = name;
		this.id = id;
	}
	public void dispDetails()
	{
		System.out.println("Name: "+ name);
		System.out.println("Id: "+ id);
		
		Scanner b1 = new Scanner(System.in);		
		System.out.println("Basic Salary: ");
		bSal = b1.nextDouble();
		System.out.println("");
	}
}

class Direct2 extends Que1
{
	double sal;
	int ta;
	int da;
	Direct2(String name,int id, int ta, int da)
	{
		super(name, id);
		this.ta = ta;
		this.da = da;	
	}
	void calDirectSal()
	{
	sal = bSal + ta + da;
	System.out.println("TA: "+ ta);
	System.out.println("DA: "+ da);
	System.out.println("Direct Salary: "+ sal);
	}
}

class Conti2 extends Que1
{
	int pday;
	int cSal;
	Conti2(String name,int id, int pday)
	{
	super(name,id);
	this.pday = pday;
	}
	void CalContSal()
	{
		cSal = pday *30;
		System.out.println("Contract Salary: "+ cSal);
	}
	
}

class demo
{
	public static void main(String[] args) 
	{
		Direct2 ca1 = new Direct2("Sujith", 1001, 10, 20);
		ca1.dispDetails();
		ca1.calDirectSal();
		
		
		Conti2 c1 = new Conti2("Sujith", 1001, 10);
		
		c1.CalContSal();
		
	}

}

