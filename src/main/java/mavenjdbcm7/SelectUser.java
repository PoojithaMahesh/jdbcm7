package mavenjdbcm7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectUser {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm7","root","root");
	Statement statement=connection.createStatement();
	ResultSet resultSet=statement.executeQuery("Select * from User where id=2");
	
	if(resultSet.next()) {
		System.out.println(resultSet.getInt(1));
		System.out.println(resultSet.getString(2));
		System.out.println(resultSet.getString(3));
	}
	connection.close();
	System.out.println("Data Selected successfully");

}
}
