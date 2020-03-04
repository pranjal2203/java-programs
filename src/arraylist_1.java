import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Collections;
public class arraylist_1
{
	public static void main(String args[])
	{
		ArrayList <Integer> a =new ArrayList<Integer>();
		
		Scanner obj = new Scanner(System.in);
		a.add(23);
		a.add(21);
		a.add(80);
		a.add(15);
		a.add(19);
		a.add(36);
		a.add(75);
		a.add(35);
		a.add(25);
		a.add(95);
		a.add(45);
		a.add(13);
//		for(int i=1;i<=5;i++)
//		{
//			System.out.println("enter number");
//			int a1 = obj.nextInt();
//			a.add(a1);
//		}
		a.add(6);		
		a.add(10);
		System.out.println("arraylist after adding elements : ");
		System.out.println(a);
		
		a.remove(4);
		a.remove(2);
		System.out.println("arraylist after removing element : ");
		System.out.println(a);
		
		a.set(2,10);
		a.set(4,20);
		System.out.println("arraylist after modifying elements : ");
		System.out.println(a);
		
		
		
		Iterator i =  a.iterator();
		while(i.hasNext())
			System.out.print(" " +i.next() );
			
		
		System.out.println("\n Enter position to display the value: ");
		int g1 = obj.nextInt();
		System.out.println(a.get(g1));
		
		Collections.sort(a);
		System.out.print("Sort:" + a);
		
		
	}
}
