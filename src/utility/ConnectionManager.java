package utility;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {
	public static Connection getConnection() throws SQLException, ClassNotFoundException
	{
		Connection conn = null;
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","prograd","oracle");
		
		if(conn != null)
			System.out.println("Connection Established");
		else
			System.out.println("Connection is not Established");
		return conn;
		
	}
	 public static Properties loadPropertiesFile() throws IOException
	 {
		 Properties prop = new Properties();	
			InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
			prop.load(in);
			in.close(); 
			return prop;
		 
	 }
}
