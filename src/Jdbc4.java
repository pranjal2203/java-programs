import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;




public class Jdbc4 
{
	public static void main(String[] args) throws SQLException,ClassNotFoundException
	{
		 Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");

			System.out.println("Connected");
			
			String Str;
			Str= "Select * from Dbda25 where bookid=?";
			
			
			
			PreparedStatement pmt = con.prepareStatement(Str);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Bookid: ");
			int bid = sc.nextInt();
			pmt.setInt(1, bid);
			ResultSet rs = pmt.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3)+rs.getInt(4));
			}
			
			//Update the Price using Bookid
			String Str1;
			Str1= "Update Dbda25 set bname = ?  where bookid = ?";
			PreparedStatement pmt1 = con.prepareStatement(Str1);
			
		
			System.out.println("where bookid: ");
			int bookid = sc.nextInt();
			
			System.out.println("Update book name: ");
			String bname =sc.next();
			
			
			pmt1.setString(1, bname);
			pmt1.setInt(2, bookid);
			
			
			int rs1 = pmt1.executeUpdate();
			System.out.println(rs1+"rows affected");
			
			
			//Display the set after update
			Statement smt2 = con.createStatement();
			String str3= "Select * from Dbda25";
			ResultSet rs2 = smt2.executeQuery(str3);
			
			
			while(rs2.next())
			{
				System.out.println(rs2.getInt(1)+rs2.getString(2)+rs2.getString(3)+rs2.getInt(4));
			}
			
			//Delete a record
			String Str2;
			Str2 = "Delete from Dbda25 where bookid = ?";
			PreparedStatement pmt2 =con.prepareStatement(Str2);
			System.out.println("Enter the bookid: ");
			
			int bid2 =sc.nextInt();
			System.out.println("check3");
			pmt2.setInt(1, bid2);
			ResultSet rs3 = pmt2.executeQuery();
			
			System.out.println(rs3+"rows deleted");
			
			//display all records
			String Str3 ="Select * from Dbda25";
			Statement smt3 =con.createStatement();
			ResultSet rs4 =smt3.executeQuery(Str3);
			while(rs4.next())
			{
				System.out.println(rs4.getInt(1)+rs4.getString(2)+rs4.getString(3)+rs4.getInt(4));
			}
			
			
			
			
					
	}

}
