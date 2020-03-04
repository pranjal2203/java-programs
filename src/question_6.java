import java.util.Scanner;


public class question_6 
{
 int emp_no;
 String name;
 String desgn;
 String dept;
 long salary;
 String doj;
 
 public void readData()
 {
	 Scanner obj = new Scanner(System.in);
	 
	 System.out.println("Enter the Employee number: ");
	 emp_no = obj.nextInt();
	 
	 System.out.println("Enter the name of the Employee: ");
	 name= obj.next();
	 
	 System.out.println("Enter the designation of the Employee: ");
	 desgn= obj.next();
	 
	 System.out.println("Enter the department of the Employee: ");
	 dept = obj.next();
	 
	 System.out.println("Enter the salary of the Employee: ");
	 salary = obj.nextLong();
	 
	 System.out.println("Enter the Date of Joining: ");
	 doj = obj.next();
	 
 }
 
 public void displayData()
 {
	 System.out.println("The employee ID is " + emp_no);
	 System.out.println("The employee name is "+ name);
	 System.out.println("The designation of the employee is " + desgn);
	 System.out.println("The department of the employee is " + dept);
	 System.out.println("The salary of the employee is "+salary);
	 System.out.println("The date of joining is: "+doj);
 }

public static void main(String args[])
{
question_6 e1=new question_6();
e1.readData();
e1.displayData();
}
}