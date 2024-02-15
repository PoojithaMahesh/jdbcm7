package mavenjdbcm7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class LoadAndRegisterDriverConcept {
public static void main(String[] args) throws Exception {
//	1a.Load the Driver
	Driver driver=new Driver();
//	b.Register the Driver
	DriverManager.registerDriver(driver);
//	2.Establish the Connection
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm7","root","root");
//	3.Create a Statement
	Statement statement=connection.createStatement();
//	4.EXecute a query
	statement.execute("insert into User values(200,'jahnavi','bangalore')");
//	5.close the connection
	connection.close();
	
	System.out.println("Data inserted successfully with load and register the driver explicitily");
	
}
}
