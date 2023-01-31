package domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBC {

	public static void main(String[] args) {
		String urlOracle="jdbc:oracle:thin:@localhost:1521:orcl";
		String username="SYSTEM";
		String password="#Database1818";
		try {
			Connection conOracle = DriverManager.getConnection(urlOracle,username,password);	
			System.out.println("Connection Successful");
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
}
