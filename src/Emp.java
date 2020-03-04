import java.util.Scanner;

//Set and get example
public class Emp 
{
	int ssn;
	String First;
	String Last;
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getFirst() {
		return First;
	}
	public void setFirst(String first) {
		First = first;
	}
	public String getLast() {
		return Last;
	}
	public void setLast(String last) {
		Last = last;
	}
	public void print()
	{
		System.out.println("ssn: "+ssn);
		System.out.println("First: "+First);
		System.out.println("Last: "+Last);
	}
}

class TempEmp
{
	public static void main(String[] args) 
	{
		Emp e=new Emp();
		e.setSsn(123);
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(e.getSsn());
		e.setFirst(str);
		//System.out.println(e.getFirst());
		System.out.println("My First name is:"+ e.First);
		
	}
}

