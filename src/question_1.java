import java.util.Scanner;


public class question_1 
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter length of an array : ");
		int n=obj.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
		System.out.println("enter numbers in the array : ");
		arr[i]=obj.nextInt();
		}
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
			sum=sum+arr[i];
		System.out.println("the sum of all elements of an array is : "+sum);
	}
}
