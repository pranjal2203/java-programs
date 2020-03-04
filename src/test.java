import java.util.Scanner;


public class test 
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

class direct extends test
{
	long sal;
	int ta, da;
	
	public void cal()
	{
		sal = basic + ta + da;
	}
		
	public static void main(String[] args) {
		direct dt = new direct();
		dt.read();
		dt.cal();
		dt.disDetails();
	}
	
	
}