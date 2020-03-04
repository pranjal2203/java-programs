import java.util.Scanner;


public class question_10 
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter number of units consumed : ");
		int n=obj.nextInt();
		double bill=0.0;
		if(n<=100)
		bill=n*1.20;
		else if(n>100 && n<=300)
			bill=(n-100)*2+120;
		else if(n>300 && n<=600)
			bill=(n-300)*3+120+400;
		else if(n>600)
			bill=(n-600)*5+120+400+900;
		System.out.println("no of units consumed : "+n+" and totalamount for the consupmtion is : "+bill);
	}
}
