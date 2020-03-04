import java.util.Scanner;


public class question_2 
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
		int max=arr[0],min=arr[1];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
		}
		for(int j=0;j<arr.length;j++)
		{
			if(min>arr[j])
				min=arr[j];
		}
		System.out.println("the greatest number in the array is : "+max+" the smallest number in the array is : "+min);
	}
}
		