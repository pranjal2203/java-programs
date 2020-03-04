import java.util.Scanner;


public class Q4_Person 
{
	String name;
	int age;
	char gender;
	String cat;
	
/*	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	*/
	
	void dispDetails()
	{
		System.out.println("Your name  is:  " + name);
		System.out.println("Your Age: " + age );
		System.out.println("Your Gender " + gender);
	}
	void eat()
	{
		System.out.println("It is good to have food on time");
	}
	void walk()
	{
		System.out.println("Walking is a good exercise.");
	}
}

class Student extends Q4_Person
{
	/*String program;
	int year;
	
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	*/
	void dispDetails1()
	
	{
		Scanner st1 = new Scanner(System.in);
		System.out.println("Enter Program: ");
		String prg = st1.next();
		System.out.println("Enter YOP: ");
		int yr1 = st1.nextInt();
		//super.dispDetails();
		System.out.println("Your Program:  " + prg);
		System.out.println("Year of Passing: " + yr1 );
		
	}
	void walk()
	{
		System.out.println("Students must only walk inside the campus.");
	}
	void study()
	{
		System.out.println("Students should study every day.");
	}
	void eat()
	{
		System.out.println("Students' lunch time is between 1PM to 2 PM.");
	}
	
	void heldExam()
	{
		System.out.println("All students passed the Exam held in last month.");
	}
}

class Techer extends Q4_Person
{
	String designation;
	double salary;
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	void dispDetails2()
	{
		System.out.println("Designation is :" + getDesignation());
		System.out.println("The salary of Teacher is: " + getSalary());
	}
	void eat()
	{
		System.out.println("Teachers' lunch time is between 1:30 PM and 2:30PM");
	}
	void walk()
	{
		System.out.println("Teachers are advised to walk as far as possible inside the campus.");
	}
	void teach()
	{
		System.out.println("All teachers completed the syllabus on time.");
	}
	void takeExam()
	{
		System.out.println("Exams are conducted on time.");
	}
}

class Doctor extends Q4_Person
{
	String designation;
	double salary;
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	void dispDetails3()
	{
		System.out.println("Designation is :" + getDesignation());
		System.out.println("The salary of Teacher is: " + getSalary());
	}
	void eat()
	{
		System.out.println("Doctor always advise to have food on time.");
	}
	void walk()
	{
		System.out.println("Doctors are requested to walk from parking to the campus.");
	}
	void checkup()
	{
		System.out.println("Doctor checksup all the students every week.");
	}
	void prescribe()
	{
		System.out.println("Doctors' prescribe low dose of antibiotics.");
	}
}

class IsaR
{
	public static Q4_Person mobj(String cat)
	{
		if (cat.equalsIgnoreCase("Student"))
		{
			return new Student();
			//q1.dispDetails1();
			
			}
		else if(cat.equalsIgnoreCase("Techer"))
			return new Techer();
		else if(cat.equalsIgnoreCase("Doctor"))
		return new Doctor();
		return null;
	}
	public static void main(String[] args) 
	{
		Q4_Person q1;
		
		Scanner so = new Scanner(System.in);
		System.out.println("Enter the category: ");
		String cat = so.next();
		q1 = mobj(cat);
		
		
		System.out.println("Enter Name: ");
		String na = so.next();
		
		System.out.println("Enter Age: ");
		int ag = so.nextInt();
		System.out.println("enter gender : ");
		char ch=so.next().charAt(0);
		
		
		
		/*q1.setName(na);
		q1.setAge(ag);
		q1.setGender(ch);*/
		
		
		if(cat.equalsIgnoreCase("Student"))
				{
		((Student) q1).dispDetails1();
		((Student)q1).study();
		((Student)q1).heldExam();
				}
		else if(cat.equalsIgnoreCase("Techer"))
		{
			((Techer) q1).dispDetails2();
		((Techer)q1).teach();
		((Techer)q1).takeExam();
		}
		else if(cat.equalsIgnoreCase("doctor"))
		{
			((Doctor) q1).dispDetails3();
			((Doctor) q1).checkup();
			((Doctor) q1).prescribe();
		}
		
		q1.eat();
		q1.walk();
	}
}