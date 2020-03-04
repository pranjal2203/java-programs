import java.util.Scanner;


public class test_Empi 
{
	String name;
	int id;
	int basic;
	
	public void read()
	{
	Scanner read = new Scanner(System.in);
	System.out.println("Enter name: ");
	name=read.next();
	System.out.println("Enter ID: ");
	id=read.nextInt();
	System.out.println("Enter basic: ");
	basic=read.nextInt();
	}
	
	public void disDetails()
	{
	System.out.println("Name: "+ name);
	System.out.println("ID:"+id);
	System.out.println("Basic:"+basic);
	}
}

class direct extends test_Empi
{
	long sal;
	int ta=10, da=5;
	
	public void cal()
	{
		sal = basic + ta + da;
		System.out.println("Salary: " + sal);
	}
		
	public static void main(String[] args) 
	{
		direct dt = new direct();
		dt.read();
		dt.disDetails();
		dt.cal();
	}
	
}