package mavenjdbcm7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExecuteConcept {
public static void main(String[] args) throws Exception {
////	1.Load and Register the Driver
//	Class.forName("com.mysql.cj.jdbc.Driver");
////	2.Establish the Connection
//	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm7","root","root");
////	3.Create a Statement
//	Statement statement=connection.createStatement();
////	4.EXecute a query
//	boolean value=statement.execute("insert into User values(3,'jahnavi','bangalore')");
////	5.close the connection
//	connection.close();
//	System.out.println(value);=FALSE
//	
//	System.out.println("Data inserted successfully");
	
//	Update=FALSE
//	Class.forName("com.mysql.cj.jdbc.Driver");
//	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm7","root","root");
//	Statement statement=connection.createStatement();
//	boolean value=statement.execute("update User set name='poojitha' where id=1");
//	connection.close();
//	System.out.println(value);
//	System.out.println("Data updated successfully");
	
//	DELETE:
	
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm7","root","root");
	Statement statement=connection.createStatement();
	boolean value=statement.execute("delete from User where id=1");
	connection.close();
	System.out.println(value);
	System.out.println("Data deleted successfully");

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
