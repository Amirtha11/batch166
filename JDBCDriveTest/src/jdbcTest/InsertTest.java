package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {
	
	public static String insertQuery = "insert into courses(user_id,username, mobile,email,course,created_on,last_login) values('6','userF','6666','mail555@gmail.com','selenium','2020-07-10 02:05:00','2020-07-10 02:05:00')";
public static void main(String[] args) throws SQLException, ClassNotFoundException {
	
		Class.forName("org.postgresql.Driver");
		Connection c=DriverManager.getConnection("jdbc:postgresql://localhost:5432/batch166","postgres","vcentry1");
		Statement statement=c.createStatement();
		statement.executeQuery(insertQuery);	
	
}
}
