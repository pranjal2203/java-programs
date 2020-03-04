import java.util.*;
public class question_3
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
		System.out.println("array before reversing :");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		System.out.println("array after reversing :");
		for(int i=arr.length-1;i>=0;i--)
			System.out.println(arr[i]);
		
	}
}	