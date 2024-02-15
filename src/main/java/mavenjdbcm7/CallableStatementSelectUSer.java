package mavenjdbcm7;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class CallableStatementSelectUSer {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm7","root","root");
		CallableStatement callableStatement=connection.prepareCall("call selectUser(20)");
		ResultSet resultSet=callableStatement.executeQuery();
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
		}
		connection.close();
		System.out.println("data selected successfully witj CS");
		
		
		
		
		
	}
}
