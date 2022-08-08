import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectFromTB {
	
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
			String sqlPrikaz = "SELECT * FROM studenti";
			
			ResultSet rs = stm.executeQuery(sqlPrikaz);
			while(rs.next()) {
				int id = rs.getInt("id");
				String meno = rs.getString("meno");
				String priezvisko = rs.getString(3);
				int vek = rs.getInt(4);
				System.out.println(id + ". " + meno + " " + priezvisko + " - " + vek + " rokov.");
			}
			System.out.println("------KONIEC VYPISU------");
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
