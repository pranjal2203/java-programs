import java.util.Stack;


public class stack 
{
	public static void main(String args[])
	{
		Stack<Integer> s=new Stack<>();
		add_Stack();
		disp_Stack();
		
	}
	public static void disp_Stack() 
	{
	Integer ele;
	ele=s.pop();
	System.out.println(ele+"  ");
		
	}
	public static void add_Stack(Stack<Integer>s)
	{
		for(int i=0;i<5;i++)
			s.add(i);
	}
	
}
