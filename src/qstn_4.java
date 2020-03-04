import java.util.*;
public class qstn_4 
{
	public static void main(String args[])
	{
		int n,i,j,k,c,a;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter size of the array");
		n=obj.nextInt();
		int arr[]=new int[n];
		for(i=0;i<arr.length;i++)
		{
			System.out.println("enter a number to be filled in the array");
			arr[i]=obj.nextInt();
		}
		for(j=0;j<arr.length;j++)
		{
			c=0;
			a=arr[j];
			for(k=0;k<arr.length;k++)
			{
				if(arr[j+1]==a)
					c++;
			}
			if(c==2)
			{
				System.out.println(a);
				i++;
			}
		}
	}
}
