package mavenjdbcm7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExecuteQueryConcept {
public static void main(String[] args) throws Exception {
////	1.Load and Register the Driver
//	Class.forName("com.mysql.cj.jdbc.Driver");
////	2.Establish the Connection
//	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm7","root","root");
////	3.Create a Statement
//	Statement statement=connection.createStatement();
////	4.EXecute a query
//	statement.executeQuery("insert into User values(2,'jahnavi','bangalore')");
////	5.close the connection
//	connection.close();
//	
//	System.out.println("Data inserted successfully");
//	RESULT=EXCEPTION

//	UPDATE
//	Class.forName("com.mysql.cj.jdbc.Driver");
//	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm7","root","root");
//	Statement statement=connection.createStatement();
//	statement.executeQuery("update User set name='poojitha' where id=1");
//	connection.close();
//	System.out.println("Data updated successfully");
//	RESULT=EXCEPTION
	
//	DELETE
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm7","root","root");
	Statement statement=connection.createStatement();
	statement.executeQuery("delete from User where id=1");
	connection.close();
	System.out.println("Data deleted successfully");
	
	
	
}
}
