import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class VytvorenieDB {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost";
	
	static final String USER = "root";
	static final String PASS = "";
	
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stm = null;
		
		try {
			Class.forName(JDBC_DRIVER);
			
			System.out.println("Prihlasujem sa na databazu ...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
			System.out.println("Vytvaram databazu ...");
			stm = conn.createStatement();
			String sqlPrikaz = "CREATE DATABASE kurzJava";
			stm.executeUpdate(sqlPrikaz);
			System.out.println("Databaza bola vytvorena ...");			
		}catch(SQLException se) {
			se.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(stm != null) {
					stm.close();
				}
			}catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(conn != null) {
					conn.close();
				}
			}catch(SQLException se) {
				se.printStackTrace();
			}
		}
	}
}