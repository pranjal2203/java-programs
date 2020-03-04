import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class Jdbc1 
{
public static void main(String[] args) throws SQLException,ClassNotFoundException
{
	 Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
		System.out.println("Database Connected");
		
		Statement smt = con.createStatement();
		String Str = "Select * from Dbda25";
		ResultSet rs = smt.executeQuery(Str);
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1) +  rs.getString(2) + rs.getString(3) + rs.getString(4));
			
		}
}
}
