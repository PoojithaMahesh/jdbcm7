package mavenjdbcm7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class BatchExecution {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcm7","root","root");
		PreparedStatement preparedStatement=connection.prepareStatement("insert into user values (?,?,?)");               
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter the number of entries that you want to save");
		int entries=scanner.nextInt();
		int i=0;
	    while(entries>i) {
	    	System.out.println("please give id");
	    	int id=scanner.nextInt();
	    	System.out.println("please give name");
	    	String name=scanner.next();
	    	System.out.println("please give address");
	    	String address=scanner.next();
	    	preparedStatement.setInt(1, id);
	    	preparedStatement.setString(2, name);
	    	preparedStatement.setString(3, address);
	    	preparedStatement.addBatch();
	    	i++;
	    }
	preparedStatement.executeBatch();
	connection.close();
	System.out.println("MULTIPLE DATA SAVED SUCCESSFULLY with execute batch");


	}
}

