import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Jdbc5 
{
	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{
		 Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");

			System.out.println("Connected");
		
			Statement smt =con.createStatement();
			
	}

}
