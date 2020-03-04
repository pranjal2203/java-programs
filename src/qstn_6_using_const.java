import java.util.Scanner;


public class qstn_6_using_const 
{
	int emp_no;
	String emp_name;
	String emp_designation;
	String emp_dept;
	double sal;
	String doj;
	
	qstn_6_using_const(int emp_no, String  emp_name, String emp_designation,String emp_dept, double sal, String doj)
	{
		 this.emp_no=emp_no;
		 this.emp_name=emp_name;
		 this.emp_designation=emp_designation;
		 this.emp_dept=emp_dept;
		 this.sal=sal;
		 this.doj=doj;
	}
	
	
	public void disData()
	{
	System.out.println("The Employee no is: " + emp_no);
	System.out.println("The Employee name is: "+ emp_name);
	System.out.println("The Employee DEsignation is: "+emp_designation);
	System.out.println("The Employee belongs to department: "+ emp_dept);
	System.out.println("The salary of Employee is: "+ sal);
	System.out.println("The Date of joining of employee is: "+doj);
	}
	public static void main(String[] args) 
	{
		qstn_6_using_const emp1 = new qstn_6_using_const(1, "Sujith", "stud1", "dbda", 0, "Feb18");
		emp1.disData();
	}

}
