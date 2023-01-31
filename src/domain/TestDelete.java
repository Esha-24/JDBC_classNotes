
package domain;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDelete {

	public static void main(String[] args) {
		String urlOracle="jdbc:oracle:thin:@localhost:1521:orcl";
		String username="sys as sysdba";
		String password="#Database1818";
		try {
			Connection conOracle = DriverManager.getConnection(urlOracle,username,password);	
			System.out.println("Connection Successful");
			String query = "delete from student where id=1007";
			Statement stmt = conOracle.createStatement();
			int x = stmt.executeUpdate(query);
			System.out.println(x+"Record deleted Successfully.");			
			
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
}
