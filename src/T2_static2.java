
public class T2_static2 
{
	static int a =  42;
	static int b = 99;
	
	//When the following method is not mentioned static, object needs to be created in the other class to access data.
	static void callme()
	{
	System.out.println("a = "+ a);	
	}
}

class StaticByName
{
	public static void main(String[] args) 
	{
		//Following alike object need to be created when the method was not declared static in any class.
		//T2_static2 st1 = new T2_static2();
		//st1.callme();
		
		
		T2_static2.callme();
		System.out.println("b= "+ T2_static2.b);
	}
}