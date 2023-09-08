import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDelete {
	public static void main(String agrs[]) {
		String url ="jdbc:mysql://localhost:3306/javabatch";
		String username ="root";
		String password ="Momos@60";
		Connection connection = null;
		
		
		
		// STEP 1 Load/register the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. Establish connection
			 connection = DriverManager.getConnection(url, username, password);
			//3. Establish the statement 
			Statement statement = connection.createStatement();
			//4. execute the statement - return type boolean
		   statement.execute("DELETE FROM student WHERE ID = 3");	    	   	    
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
				 System.out.println("ALL GOOD");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

}
}
}	