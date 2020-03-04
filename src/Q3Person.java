import java.util.Scanner;


public class Q3Person {

	String name;
	int age;
	
	/*
	public String getName() 
	{
		Scanner na = new Scanner(System.in);
		System.out.println("Enter Name: ");
		name = na.next();
		return name;
	}
	public int getAge() 
	{
		Scanner ag = new Scanner(System.in);
		System.out.println("Enter Age: ");
		age = ag.nextInt();
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}

*/
	void myProfession()
	{
		System.out.println("Not a professional Person");
	}
}

class Employee3 extends Q3Person
{
	void myProfession()
	{
		System.out.println("Im am an Employee");
	}
}

class PerEmployee extends Employee3
{
	void myProfession()
	{
		System.out.println("Im a Permanent Employee");
	}
}

class conEmployee extends Employee3
{
	void myProfession()
	{
		System.out.println("Im a Contract Employee");
	}
}

class Teacher extends Q3Person
{
	void myProfession()
	{
		System.out.println("Im a Teacher");
	}
}

class Poly
{
	public static Q3Person obj(String str) //creating method with Super classname
	{
		if(str.equals("Teacher"))
		{
			return new Teacher();
		}
		else if(str.equals("No"))
		{
			return new Q3Person();
		}
		else if(str.equals("Permanent"))
		{
			return new PerEmployee();
		}
		else if(str.equals("Contract"))
		{
			return new conEmployee();
		}
		else return new Employee3();
	}
	
	public static void main(String[] args) 
	{
		/* normal object creation for each class
		Q3Person n1= new Q3Person();
		n1.myProfession();
		
		PerEmployee p1 = new PerEmployee();
		p1.myProfession();
		
		conEmployee c1 = new conEmployee();
		c1.myProfession();
		
		Teacher t1 = new Teacher();
		t1.myProfession();
		*/
		
		
		/* using Super Class object only
		Q3Person p;
		p= new Q3Person();
		p.myProfession();
		
		p = new Employee3();
		p.myProfession();
		
		p = new PerEmployee();
		p.myProfession();
			
		p= new conEmployee();
		p.myProfession();
		
		p= new Teacher();
		p.myProfession();
		*/
		
		Q3Person p; //Create Super class Reference variable
		Scanner per = new Scanner(System.in); //creating object
		System.out.println("Enter the category: "); //read statement
		String str = per.next(); //initializing the variable
		
		
		p = obj(str); //super class ref variable = method(variable) and calling the instance method
		p.myProfession(); //use Sup clas ref variable and assign the matching the method
		/* p.myProfession() ==> obj(Str).myProfession()
		 * e.g. Str = No
		 * => obj(No) calls---> and returns to create new object for the mentioned Class(Q3Person-Super)
		 */
		
		
	}
	
	
}