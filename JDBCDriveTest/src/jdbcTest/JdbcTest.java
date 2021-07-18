package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	//ip address, portnumber, username,password,database
	
	Class.forName("org.postgresql.Driver");
	Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/batch166","postgres","vcentry1");
	
	Statement statement= c.createStatement();
	ResultSet result= statement.executeQuery("select * from courses");
	while(result.next()){
		
		// System.out.println(result.getString(1)+"   "+result.getString(2)+"   "+result.getString(3));
		
		String email= result.getString(4);
		if(email.equals("mail123@gamil.com")){
			
			System.out.println("result found");
			
		}
		else{
			
			System.out.println("result not found");
		}
	}
	
	
}	
}
