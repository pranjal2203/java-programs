import java.util.*;
public class qstn_7 
{
	int cus_no;
	String cus_name;
	int u;
	double bill;
	
	qstn_7()
	{
		cus_no=1;
		cus_name="dbda";
		u=320;
		bill=0.0;
	}
	public void showData()
	{
		System.out.println("the customer number is : "+cus_no);
		System.out.println("the customer name is : "+cus_name);
		System.out.println("the customer's consumed units are : "+u);
		System.out.println("the customers's bill is : "+bill);
	}
	public void computeBill()
	{
		if(u<=100)
		{
			bill=u*1.2;
		}else if(u>100 && u<=300)
		{
			bill= (u-100)*2 + 120;
		}else if(u>300 && u<=600)
		{
			bill=(u-300)*3.0 +400+ 120;
		}
		else if(u>600)
		{
			bill=(u-600)*5 +900+400+ 120;
		}
	}
	
	public static void main(String[] args) 
	{
		qstn_7 eb = new qstn_7();
		eb.computeBill();
		eb.showData();
		
	}
}
