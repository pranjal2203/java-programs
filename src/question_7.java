import java.util.Scanner;


public class question_7 
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a number for which table is to be printed : ");
		int n=obj.nextInt();
		for(int i=1;i<=10;i++)
			System.out.println(n+" * "+" "+i+ " = "+(n*i));
		
	}

}
