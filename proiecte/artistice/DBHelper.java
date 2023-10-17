package proiecte.artistice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBHelper {
private static Connection c;
	
	public static Connection getConnection() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		if(c == null || c.isClosed()) {
			Properties cProps = new Properties();
			cProps.put("user", "root");
			cProps.put("password", "");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hmw171023", cProps);
		}
		return c;
	}
	
	public static void closeConnection() {
		try {
			c.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
