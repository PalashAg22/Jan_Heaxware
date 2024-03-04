package dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtility {

	 static Connection conn = null;
	public static Connection getDBConnection() {
		try {
			FileReader reader = new FileReader("resources/database.properties");
			Properties properties = new Properties();
			properties.load(reader);
			String driver = properties.getProperty("driverclass");
			String url = properties.getProperty("url");
			String username = properties.getProperty("username");
			String password = properties.getProperty("password");
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Class.forName(driver);
			//conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hexaware_db");
			conn = DriverManager.getConnection(url,username,password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
	}
}
