package mavenjdbcm7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementSaveUser {
public static void main(String[] args) throws Exception {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm7","root","root");
PreparedStatement preparedStatement=connection.prepareStatement("insert into User values(?,?,?)");

Scanner scanner=new Scanner(System.in);
System.out.println("Please enter the id");
int id=scanner.nextInt();
System.out.println("please eneter the name");
String name=scanner.next();
System.out.println("please enter the address");
String address=scanner.next();


preparedStatement.setInt(1, id);
preparedStatement.setString(2, name);
preparedStatement.setString(3, address);

preparedStatement.execute();

System.out.println("saved data to the database with PS and without closing the connection");


}
}
