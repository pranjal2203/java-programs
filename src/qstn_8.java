
public class qstn_8 
{
	int id;
	String name;
	int mark;
	String result;
	
	qstn_8(int id, String name, int mark)
	{
		this.id=id;
		this.name= name;
		this.mark=mark;
	}
	
	public void disResult()
	{
		System.out.println("The student id is: "+id);
		System.out.println("The student name is: "+name);
		System.out.println("The student mark is: "+mark);
		if(mark<40)
		{
			System.out.println("Result:FAIL");
		}
		else
		{
			System.out.println("Result: PASS");
		}
	}
	
	
	public static void main(String[] args) 
	{
		qstn_8 stu1 = new qstn_8(1001, "Sujith", 30);
		qstn_8 stu2 = new qstn_8(1002, "Sujith1", 40);
		stu1.disResult();
		stu2.disResult();
	}
}
