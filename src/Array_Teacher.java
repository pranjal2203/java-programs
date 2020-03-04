import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


public class Array_Teacher 
{
	int id, sal;
	String name, sub;
	
	Array_Teacher(int id, String name, String sub, int sal)
	{
		this.id = id;
		this.sub =sub;
		this.sal = sal;
		this.name = name;
	}
	
	  void dispDetails()
	{
		System.out.println(id + " " + name  + " " + sub + " " + sal  );
	}
//	public String toString()
//	{
//		return (id + " " + name  + " " + sub + " " + sal  );
//	}
}

class Array2
{
	public static void main(String[] args) 
	{
		Array_Teacher A = new Array_Teacher(1001,"sujith","Physics",5000);
		Array_Teacher B = new Array_Teacher(01,"dushyant","history",2000);
		Array_Teacher C = new Array_Teacher(1903,"rajnikant","maths",8000);
		Array_Teacher D = new Array_Teacher(101,"vinod","g.k",1000);
		Array_Teacher E = new Array_Teacher(1045,"abhay","moral science",6000);
		
		ArrayList<Array_Teacher> al=new ArrayList<>();
		al.add(A);
		al.add(B);
		al.add(C);
		al.add(D);
		al.add(E);
		
		Iterator<Array_Teacher> it=  al.iterator();	
		while(it.hasNext())
		{
			Array_Teacher a=(Array_Teacher)it.next();
			a.dispDetails();
		}
		
		SortbySal sa = new SortbySal();
		Collections.sort(al , sa);
		System.out.println("after sorting : ");

		

		for(Array_Teacher a: al)
		{
			System.out.println(a.id + "" + a.name + " " + a.sal);
		}
	}
}

class SortbySal implements Comparator<Array_Teacher>
{
	public int compare(Array_Teacher A1 , Array_Teacher A2)
	{
		if(A1.sal > A2.sal)
		return 1;
		else 
			return -1;
	}
}
