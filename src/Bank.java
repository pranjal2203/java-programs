import java.util.Scanner;


abstract public class Bank 
{
	String name;
	int acc_no;
	int tot;
	int roi;
	int loan;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public int getLoan() {
		return loan;
	}

	public void setLoan(int loan) {
		this.loan = loan;
	}

	public void account_details()
	{
		System.out.println("the account holder's name is : "+ getName());
		System.out.println("the account holder's account number  is : "+getAcc_no());
		System.out.println("the account holder's Total Balance  is : "+getTot());
		
	}
	
	abstract public void rateofInterest();
	
	public void calculateLoan()
	{
		
		loan = tot -(tot*roi/100);
		System.out.println("The eligibility Loan amount is: " +loan );
	}
}

class SBI extends Bank
{
	
	public void rateofInterest()
	{
		super.roi=4;
		
		System.out.println("The rate of interest is: 4");
	}	
}
class ICICI extends Bank
{
	public void rateofInterest()
	{
		super.roi=6;
		System.out.println("The rate of interest is: 6%");
	}
}
class HDFC extends Bank
{
	public void rateofInterest()
	{
		super.roi=7;
		System.out.println("The rate of interest is: 7%");
	}
}

class CustomerDet
{
	public static Bank mobjb(String accbank)
	{
		if(accbank.equalsIgnoreCase("SBI"))
		{
			return new SBI();
		}
		else if(accbank.equalsIgnoreCase("HDFC"))
		{
			return new HDFC();
		}
		else if(accbank.equalsIgnoreCase("ICICI"))
		{
			return new ICICI();
		}
		return null;
	}
	public static void main(String[] args) {
		Bank b;
		
		Scanner bobj = new Scanner(System.in);
		System.out.println("Enter Bank Name: ");
		String accbank = bobj.next();
		
		b=mobjb(accbank);
		
		System.out.println("Enter Account No.: ");
		int acc_no = bobj.nextInt();
		
		System.out.println("Enter Balance: ");
		int tot = bobj.nextInt();
	
		
		System.out.println("Enter Name: ");
		String name = bobj.next();
		b.setAcc_no(acc_no);
		b.setName(name);
		b.setTot(tot);
		b.account_details();
		b.rateofInterest();
		b.calculateLoan();
		
		bobj.close();
	}
}