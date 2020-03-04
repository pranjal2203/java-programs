import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;






public class Jdbc2 
{
	public static void main(String[] args) throws SQLException,ClassNotFoundException
	{
		 Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
			
			System.out.println("Connection established.");
			
			
			String Str = "Select * from Dbda25 where bookid = ?"; //intializing variable 
			PreparedStatement pmt = con.prepareStatement(Str);  //passign variable to the Object
			
	
			Scanner sc = new Scanner(System.in);    
			System.out.println("Enter the bookid: "); //read user input
 			int bookid= sc.nextInt();   //store user input
			
			pmt.setInt(1,bookid);   //passing user input
			
			ResultSet rs = pmt.executeQuery();
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1) +rs.getString(2) + rs.getString(3) + rs.getInt(4));
			}
			
			
	}

}
