import java.util.Scanner;

public class question_4 
{
	public static void main(String[] args)
	{
		int a, b, temp;
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter value for a: ");
		a = obj.nextInt();
		
		System.out.println("Enter value for b: ");
		b = obj.nextInt();
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("The value for swapped a is: " + a);
		System.out.println("The value for swapped b is: " + b);
	}
}
