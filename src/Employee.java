import java.util.*;
public class Employee 
{
	int id;
	String name;
	long basic;
	public void readData()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter your id");
		id=obj.nextInt();
		System.out.println("enter your name");
		name=obj.next();
		System.out.println("enter your basic salary");
		basic=obj.nextInt();
	}
	public  void dispDetails()
	{
		System.out.println("the entered id is : "+id);
		System.out.println("the entered name is : "+name);
		System.out.println("the entered  basic salary is : "+basic);
	}
	
}
 class direct extends Employee
 {
	 long sal;
	 int ta;
	 int da;
	 public void read()
	 {
		 Scanner ob=new Scanner(System.in);
		 System.out.println("enter T.A");
		 ta=ob.nextInt();
		 System.out.println("enter D.A");
		 da=ob.nextInt();
	 }
	  public void calculateDirectEmpSalary()
	  {
		sal= basic+ta+da;
		System.out.println("the total salary is : "+sal); 
	  }
	  public static void main(String args[])
	  {
		  direct d=new direct();
		  d.readData();
		  d.read();
		  d.calculateDirectEmpSalary();
		  d.dispDetails();
		  
	  }
 }
	 