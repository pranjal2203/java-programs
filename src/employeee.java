import java.util.*;
public class employeee 
{
	int ssn;
	String fn;
	String ln;
	public int getSsn(int ssn) 
	{
		System.out.println("enter your ssn number");
		Scanner obj=new Scanner(System.in);
		ssn=obj.nextInt();
		return ssn;
	}
	public String getFn(String fn) 
	{
		System.out.println("enter your first name");
		Scanner obj=new Scanner(System.in);
		fn=obj.next();
		return fn;
	}
	public String getLn(String ln) 
	{
		System.out.println("enter your last name");
		Scanner obj=new Scanner(System.in);
		ln=obj.next();
		return ln;
	}
	public void setSsn(int ssn) 
	{
		this.ssn = ssn;
	}
	
	public void setFn(String fn) 
	{
		this.fn = fn;
	}
	
	public void setLn(String ln)
	{
		this.ln = ln;
	}
		
	public void print(int ssn,String fn,String ln)
	{
		System.out.println("the entered ssn number is : "+ssn);
		System.out.println("the entered first name is : "+fn);
		System.out.println("the entered last name is : "+ln);
	}	
}

class hourly_employee extends employeee
{
	double gpay;
	double netpay;
	double salary;

	public double getSalary() 
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("entre your salary : ");
		salary=obj.nextDouble();
		return salary;
	}

	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	public void compute_grosspay()
	{
		 gpay = salary+1000+5000;
	}
	public void compute_netpay()
	{
		 netpay = salary-10000;
	}
	public void print()
	{
		System.out.println("the gross salary is : "+gpay);
		System.out.println("the net salary is : "+netpay);
	}
}
class salariedemployee extends employeee
{
	double gpay;
	double netpay;
	double salary;
	public double getSalary() 
	{
		Scanner obj=new Scanner(System.in);
	System.out.println("entre your salary : ");
	salary=obj.nextDouble();
		return salary;
	}
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	public void compute_grosspay()
	{
		 gpay = netpay - 2500;
	}
	public void compute_netpay()
	{
		 netpay = salary + 1000 + 5000;
	}
}
class test 
{
	employeee ob=new employeee();
	ob.getSsn()
	
}
	
	
	
	
	
	
