import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestGetALL {
	public static void main(String agrs[]) {
		String url ="jdbc:mysql://localhost:3306/javabatch";
		String username ="root";
		String password ="Momos@60";
		Connection connection = null;
		String sql = "SELECT * FROM student WHERE ID= 1";
		
		
		
		// STEP 1 Load/register the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. Establish connection
			 connection = DriverManager.getConnection(url, username, password);
			//3. Establish the statement 
			Statement statement = connection.createStatement();
			//4. execute the statement - return type boolean
			    ResultSet resultSet= statement.executeQuery(sql);
		 while(resultSet.next()) {
			 System.out.println(resultSet.getInt(1));
			 System.out.println(resultSet.getString(2));
			 System.out.println(resultSet.getString(3));
			 
		 }
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
