package mavenjdbcm7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExecuteUpdateUpdateUser {
public static void main(String[] args) throws Exception {
//	1.Load and Register the Driver
	Class.forName("com.mysql.cj.jdbc.Driver");
//	2.Establish the Connection
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm7","root","root");
//	3.Create a Statement
	Statement statement=connection.createStatement();
//	4.EXecute a query
	int value=statement.executeUpdate("update User set name='poojitha' where id=20");
//	5.close the connection
	connection.close();
	System.out.println(value);
	System.out.println("Data inserted successfully");
	
}
}
