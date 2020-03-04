import java.util.Scanner;


public class question_5 
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter dimension of array");
		int n=obj.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter values ");
			arr[i]=obj.nextInt();
		} 
		for(int i=0;i<arr.length;i++)
		{
			if((arr[0]>arr[1]))
			{
				int temp =arr[1];
				arr[0]=arr[i+1];
				arr[i+1]=arr[i];
			}
		}
		System.out.println("the second largest element in the array is :  "+arr[n-2]);
	}
}
