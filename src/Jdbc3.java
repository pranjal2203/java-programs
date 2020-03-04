import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class Jdbc3 
{
	public static void main(String[] args) throws SQLException,ClassNotFoundException
	{
		 Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");

			System.out.println("Connected");
		
			Statement smt =con.createStatement();
			String Str = "Select * from Dbda25";
			ResultSet rs = smt.executeQuery(Str);
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+ rs.getString(2)+rs.getString(3)+rs.getInt(4));
			}
			
			String Str1="Update Dbda25 set Price =Price+200  where BOOKID = 1002";
			int rs1 = smt.executeUpdate(Str1);
			System.out.println(rs1 + "rows updated");
			
			
			String Str2 = "Select * from Dbda25";
			ResultSet rs2 = smt.executeQuery(Str2);
			while(rs2.next())
			{
				System.out.println(rs2.getInt(1)+ rs2.getString(2)+rs2.getString(3)+rs2.getInt(4));
			}
			
	}

}
