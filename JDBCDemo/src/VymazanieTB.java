import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class VymazanieTB {
	
	static final String DB_URL = "jdbc:mysql://localhost/kurzjava";
	
	static final String USER = "root";
	static final String PASS = "";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stm = null;
		
		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Pripojenie na DB uspesne ...");
			
			stm = conn.createStatement();
			String sqlPrikaz = "DROP TABLE studenti";
			stm.executeUpdate(sqlPrikaz);
			System.out.println("Tabulka studenti bola vymazana ...");
		}catch(SQLException se) {
			se.printStackTrace();
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
