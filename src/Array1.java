import java.util.ArrayList;
public class Array1 
	{
		public static void main(String[] args) 
		{
			ArrayList<String> al = new ArrayList<String>();
			System.out.println("Initial size of al: " +  al.size());
			
			al.add("C");
			al.add("Element Two");
			al.add("Three");
			al.add("Four");
			System.out.println("Contents of Array after initialized: " + al);
			System.out.println("Size of al after additions: " + al.size());
			
			al.add(1, "2");
			System.out.println("Contents of Array after updating 1: " + al);
		}
	}