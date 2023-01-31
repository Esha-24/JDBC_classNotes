
package domain;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestRead {

	public static void main(String[] args) {
		String urlOracle="jdbc:oracle:thin:@localhost:1521:orcl";
		String username="sys as sysdba";
		String password="#Database1818";
		try {
			Connection conOracle = DriverManager.getConnection(urlOracle,username,password);	
			System.out.println("Connection Successful");
			String query = "select first_name,last_name, email,phone_number,salary from employees";
			Statement stmt = conOracle.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next())
			{
				String fName = rs.getString(1);
				String lName = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				Float salary = rs.getFloat(5);
				System.out.println(fName+" "+lName+" "+email+" "+phone+" "+salary);
				
			}
			
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
}
