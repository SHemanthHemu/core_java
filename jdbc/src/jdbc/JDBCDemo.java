package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/delays", "root", "Hemanth@123");
			System.out.println(connection);
			
			Statement statement = connection.createStatement();
			statement.execute("delete from 2L33 where sno=4;");
			
			statement.close();
			connection.close();
			
			
		
	}

}
