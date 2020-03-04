public class Person
{

	int id;
	String name;
	String course;
	
	Person(int id,String name,String course)
	
	{
	this.id = id;
	this.name = name;
	this.course = course;
			
	}
	void dispPerson()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(course);
	}
	
}


class Student extends Person
{
	
	int mark;
	
	Student(int id, String name, String course,int mark) 
	{
		super(id, name, course);
		this.mark = mark;
		
	}


	
	
	
	void dispStudent()
	{  super.dispPerson();
		System.out.println(mark);
	}
	
	
	void findResult()
	{
		
		if(mark>40)
		{
			System.out.println("pass");
		}else
			System.out.println("fail");
		
	}
	
	
}


class Teacher extends Person
{
	int basic;
	
	Teacher(int id, String name, String course,int basic)
	{
		super(id, name, course);
		this.basic = basic;
	}
	
	
	void dispTeacher()
	{
		super.dispPerson();
		System.out.println(basic);
	}
	
	
	void calculateSal()
	{
		
		float sal = basic+3000;
		System.out.println(sal);
		
		
	}
	
	
}



class Test
{
	public static void main(String[] args) 
	{
		System.out.println("student object");
		
	    Student s = new Student(1001,"shan","dbda",40);
	    
	   // s.dispPerson();
	    s.findResult();
	    s.dispStudent();
	    
	    
    Student s2 = new Student(1002,"raj","dbda",50);
	    
	   // s2.dispPerson();
	    s2.findResult();
	    s2.dispStudent();
	    
	    
	    System.out.println("teacher object");
	    Teacher t = new Teacher(1003,"siju","dbda",3000);
	    t.calculateSal();
	    t.dispTeacher();
	    
	    
	}
}
