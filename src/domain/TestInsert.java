
package domain;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestInsert {

	public static void main(String[] args) {
		String urlOracle="jdbc:oracle:thin:@localhost:1521:orcl";
		String username="sys as sysdba";
		String password="#Database1818";
		try {
			Connection conOracle = DriverManager.getConnection(urlOracle,username,password);	
			System.out.println("Connection Successful");
			String query = "insert into student values(1007,'Anushree',15,'Delhi',3)";
			Statement stmt = conOracle.createStatement();
			int x = stmt.executeUpdate(query);
			System.out.println(x+"Record insertion Successful");			
			
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
}
