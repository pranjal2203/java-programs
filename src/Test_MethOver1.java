
class Test_MethOver1 
{

	int i,j;
	Test_MethOver1(int a, int b)
	{
		i =a;
		j=b;	
	}
	
	void show()
	{
		System.out.println("i and j: " + i + " " + j);
	}
}

class Meth1B extends Test_MethOver1
{
	int k;
	
	Meth1B(int a, int b, int c)
	{
		super(a, b);
		k=c;
	}
	
// Method Overriding
	void show()
	{
		super.show(); //this calls superclass method
		System.out.println("k: " + k);
	}
	
	
	/*Method Overloading
	void show(String msg)
	{
		System.out.println(msg + k);
	}
	*/
}

class Over1
{
	public static void main(String[] args) {
		Meth1B m1 = new Meth1B(1,2,3);
		m1.show();
		//m1.show("Method overloading: "); //Method overloading
	}
}