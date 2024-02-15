package mavenjdbcm7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementUpdate {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm7","root","root");
	PreparedStatement preparedStatement=connection.prepareStatement("update User set name=? where id=?");
	Scanner scanner=new Scanner(System.in);
	System.out.println("pleas enter id to be updated");
	int id=scanner.nextInt();
	System.out.println("please give a name");
	String name=scanner.next();
	preparedStatement.setString(1, name);
	preparedStatement.setInt(2, id);
	
	preparedStatement.execute();
	
	connection.close();
	
	
	System.out.println("data updated successfully");
	
	
}
}
