package mavenjdbcm7;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableStatementDeleteUser {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm7","root","root");
		CallableStatement callableStatement=connection.prepareCall("call deleteUser(3)");
		callableStatement.execute();
		connection.close();
		System.out.println("data deleted successfully witj CS");	
	}
}
