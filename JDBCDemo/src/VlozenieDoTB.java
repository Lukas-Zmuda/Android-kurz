import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VlozenieDoTB {

	static final String DB_URL = "jdbc:mysql://localhost/kurzjava";
	
	static final String USER = "root";
	static final String PASS = "";
	
	public static void main(String[] args) {
		Connection conn = null;		
		PreparedStatement stm = null;
		
		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Pripojenie na DB uspesne ...");
			
			stm = conn.prepareStatement("INSERT INTO studenti VALUES(?, ?, ?, ?)");
			
			stm.setInt(1, 3);
			stm.setString(2, "Jozef");
			stm.setString(3, "Mrkva");
			stm.setInt(4, 12);
			
			stm.executeUpdate();
			System.out.println("Zaznam vlozeny ...");			
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
