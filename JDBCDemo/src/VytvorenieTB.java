import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class VytvorenieTB {

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
			
			String sql = "CREATE TABLE studenti"
					+ "(id INTEGER NOT NULL,"
					+ "meno VARCHAR(255),"
					+ "priezvisko VARCHAR(255),"
					+ "vek INTEGER,"
					+ "PRIMARY KEY (id))";
			
			stm.executeUpdate(sql);
			System.out.println("Tabulka studenti vytvorena ...");
			
			sql = "INSERT INTO studenti VALUES(1, 'Fero', 'Mravec', 33)";
			stm.executeUpdate(sql);
			System.out.println("1. riadok vlozeny ...");
			sql = "INSERT INTO studenti VALUES(2, 'Maja', 'Vcela', 44)";
			stm.executeUpdate(sql);
			System.out.println("2. riadok vlozeny ...");
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
