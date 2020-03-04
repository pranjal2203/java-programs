
public class Q4BankAcc 
{
	long acctno;
	long totBal;
	long deposit;
	long withdrw;
	
	
	Q4BankAcc(long acctno, long totBal, long withdrw, long deposit)
	{
		this.acctno= acctno;
		this.totBal=totBal;
		this.withdrw=withdrw;
		this.deposit=deposit;
	}
	
	void acctno()
	{
		System.out.println("Account number: " + acctno);
	}
	void deposit()
	{
		System.out.println("Deposit: " + deposit);
	}
	
	void withdraw()
	{
		System.out.println("Withdrawal: "+ withdrw);
	}
	
	void bal()
	{
		System.out.println("Total Balance: " +( (totBal-withdrw)+deposit));
	}
}

class ChekAcc extends Q4BankAcc
{
	int fee;
	long balAmount;
	
	ChekAcc(long acctno, long totBal, long withdrw, long deposit, int fee)
	{
		super(acctno, totBal, withdrw, deposit);
		this.fee = fee;
	}
	
	void dedFee()
	{
		balAmount = totBal - fee;
		System.out.println("The amount of fee deducted from the account is "+ fee);
		System.out.println("The account Balance after deducting fee is "+ balAmount);
	}
	
}

class SavAcc extends Q4BankAcc
{
	int intRate;
	long accBal;
	
	SavAcc(long acctno, long totBal, long withdrw, long deposit, int intRate)
	
	{
		super(acctno, totBal, withdrw, deposit);
		this.intRate= intRate;
	}
	
	void addInt()
	{
		accBal = totBal+(intRate*totBal/100);
		System.out.println("The interest added to the account is "+ intRate);
		System.out.println("The account Balance after adding interest rate is "+ accBal);
	}
}

class Details
{
	public static void main(String[] args) 
	{
		ChekAcc c1 = new ChekAcc(1001, 1234, 100, 200, 20);
		c1.acctno();
		c1.deposit();
		c1.withdraw();
		c1.bal();
		c1.dedFee();
		
		SavAcc s1 = new SavAcc(3001, 1234, 100, 200, 20);
		s1.addInt();
		//System.out.println("New: " + s1.acctno);
	}
}