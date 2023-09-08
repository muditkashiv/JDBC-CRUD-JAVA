import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {
	public static void main(String agrs[]) {
		String url ="jdbc:mysql://localhost:3306/javabatch";
		String username ="root";
		String password ="Momos@60";
		String sql ="INSERT INTO employee VALUES( 5, 'aanchii','anchi@mail.com')";
		
		
		// STEP 1 Load/register the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. Establish connection
			Connection connection = DriverManager.getConnection(url, username, password);
			//3. Establish the statement 
			Statement statement = connection.createStatement();
			//4. execute the statement - return type boolean
		   statement.execute(sql);
		    //5.close the connection
		    connection.close();
		    System.out.println("Data Entered"
		    		+ "");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			
			e.printStackTrace();
		}
				
		
	}

}
