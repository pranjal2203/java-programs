import java.util.Scanner;

public class abc 
{

public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter dimension of the array");
		int n=obj.nextInt();
		int arr[]=new int [n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("enter number in the array");
			arr[i]=obj.nextInt();
		}
		int a=arr.length;
		System.out.println(a);
	}
}
