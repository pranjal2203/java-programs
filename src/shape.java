import java.util.Scanner;


public class shape 
{
	String name;
	shape(String name)
	{
		this.name=name;
	}
	
	public void dispShape()
	{
	//	System.out.println("the shape is : "+name);
		//Scanner sh1 = new Scanner(System.in);
		//System.out.println("Enter Shape: ");
		//name = sh1.next();
		System.out.println("The shape is: "+ name);
	}
}

class circle extends shape
{
	double radius;
	circle(String name, double radius)
	{
		super(name);
		this.radius = radius;
	}
	public void CalculateCircleArea()
	{
	/*	Scanner rad = new Scanner(System.in);
		System.out.println("Enter radius: ");
		radius = rad.nextDouble();
		*/
		double area = 22.7* radius*radius;
		System.out.println("the area is : "+area);
	}
}

 class square extends shape
{
	double length;
	square(String name, double length)
	{
		super(name);
		this.length = length;
	}
	public void CalculateSquareArea()
	{
		/*Scanner len = new Scanner(System.in);
		System.out.println("Enter Length: ");
		length = len.nextDouble();
		*/
		
		double area = length*length;
		System.out.println("the area of square is : "+area);
	}
}
 
 class Inherit
 {
	 public static void main(String[] args) 
	 {

		 circle c1 = new circle("Circle", 10);
		 c1.dispShape();
		 c1.CalculateCircleArea();
		 

		 
		 square s1 = new square("Square", 12);
		 s1.dispShape();
		 s1.CalculateSquareArea();
		 
		 
		 
	 }
 }