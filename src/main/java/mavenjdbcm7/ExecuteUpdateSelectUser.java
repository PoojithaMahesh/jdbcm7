package mavenjdbcm7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExecuteUpdateSelectUser {
public static void main(String[] args) throws Exception {

	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm7","root","root");
	Statement statement=connection.createStatement();
	statement.executeUpdate("Select * from User where id=1");
	connection.close();
	System.out.println("Data deleted successfully");


}
}
