
// superclass
public class T4_Inh1 
{
	int i,j;
	void showij()
	{
		System.out.println("i and j : " + i + " " + j );
	}
	
}

//subclass
class sub1 extends T4_Inh1
{
	 int k;
	
	 void showk()
	{
		System.out.println("k: " +k);
	}	
	void sum()
	{
		System.out.println("i + j +k : " + (i+j+k));
	}
}

class SimpleInh
{
	public static void main(String[] args) 
	{
	/*	Creating separate object for Super Class
	  	T4_Inh1 Sup1 = new T4_Inh1();
		Sup1.i=10;
		Sup1.j=20;
		System.out.println("Contents of Super class: ");
		Sup1.showij();
		//System.out.println(""); */
		
		//Create Subclas object and accessSuperClass
		sub1 s2 = new sub1();
		s2.i= 25;
		s2.j=30;
		s2.k=40;
		System.out.println("Contents of subclass: ");
		s2.sum();
		
		
		
	}
}