import java.util.Scanner;


public class question_9 
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter three numbers ");
		int a= obj.nextInt();
		int b= obj.nextInt();
		int c=obj.nextInt();
		if(a>b && a>c)
			System.out.println("maximum number is : "+a);
		else if(b>a && b>c)
		System.out.println("maximum number is : "+b);
		else
		System.out.println("maximum number is : "+c);
	}
}
