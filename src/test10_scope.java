
public class test10_scope 
{
	public static void main(String[] args) 
	{
		int x;
		x=20;
		if (x==10)
		{int y = 20;
		System.out.println("x and y: " + x + " " + y);
				}
		int y= 100;
		System.out.println("x is " + x + y);
		
	}
}
