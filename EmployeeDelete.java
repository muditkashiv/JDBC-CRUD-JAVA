import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class EmployeeDelete {
	public static void main(String[] args) {
		String url ="jdbc:mysql://localhost:3306/javabatch";
		String username = "root";
		String password = "Momos@60";
		String sql = "DELETE FROM employee WHERE id = 3";
		Connection connection = null;
		
		try {
			// step 1
			Class.forName("com.mysql.cj.jdbc.Driver");
			// step 2
			       connection = DriverManager.getConnection(url, username, password);
			// step 3
			Statement statement = connection.createStatement(); 
			//step 4
			statement.execute(sql);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
				System.out.println("all good");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		}
	}

}
