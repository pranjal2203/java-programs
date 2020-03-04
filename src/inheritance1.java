import java.util.Scanner;

public class inheritance1 {

	String name;
	int id;
	double bSal;
	
	inheritance1(String name,int id)
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

class Direct1 extends inheritance1
{
	double sal;
	int ta;
	int da;
	
	Direct1(String name,int id, int ta, int da)
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

class Conti1 extends Direct1
{
	int pday;
	int cSal;
	
	Conti1(String name,int id, int ta, int da, int pday)
	{
	super(name,id, ta, da);
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
		
		Conti1 c1 = new Conti1("Sujith", 1001, 10, 20, 40);
		c1.dispDetails();
		c1.calDirectSal();
		c1.CalContSal();
		
	}

}

