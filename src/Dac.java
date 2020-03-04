//import java.util.Scanner;
//
//
//public class Courses 
//{
//	String cname;
//	static int no_students;
//  
//  Courses(String cname, int no_students)
//  {
//	  this.cname=cname;
//	  this.no_students=no_students;
//  }
//  
//}

class Dac implements Icourse
{
//	int no_place;
//	int placepercent=no_place/Courses.no_students;
	
	String cname;
	int no_students;
	int no_place = 40;
	Dac(String cname, int no_students)
	{
		this.cname=cname;
		this.no_students=no_students;
	}
	
	public void placementpercentage()
 	{
		double placepercent=no_place*100/no_students ;
		System.out.println("Course name is: "+ cname +"\n" + "No. of students placed: "+ no_place+"\n" +"Placement Percentage is : "+ placepercent);
	}

	
}

class Wimc implements Icourse
{
	String cname;
	int no_students;
	int no_place = 60;
	Wimc(String cname, int no_students)
	{
		this.cname=cname;
		this.no_students=no_students;
	}
	
	public void placementpercentage()
	{

		double placepercent=no_place*100/no_students ;
		System.out.println("Course name is: "+ cname +"\n" + "No. of students placed: "+ no_place+"\n"+ "Placement Percentage is : "+ placepercent);
	}
}

class Dass implements Icourse
{
	String cname;
	int no_students;
	int no_place = 50;
	Dass(String cname, int no_students)
	{
		this.cname=cname;
		this.no_students=no_students;
	}
	
	public void placementpercentage()
	{

		double placepercent=no_place*100/no_students ;
		System.out.println("Course name is: "+ cname +"\n"+ "No. of students placed: "+ no_place+"\n" + "Placement Percentage is : "+ placepercent);
	}
}

class Int1Courses
{
	public static void main(String[] args) 
	{
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the course name: ");
//		String cname = sc.next();
//		System.out.println("Enter total number of students: ");
//		byte no_stud = sc.nextByte();
	
		
		Dac d1 = new Dac("DAC", 100);
		d1.placementpercentage();
		Wimc w1 = new Wimc("WIMC", 120);
		w1.placementpercentage();
		Dass dd1 = new Dass("DASS", 80);
		dd1.placementpercentage();
		
		
		
	}
}