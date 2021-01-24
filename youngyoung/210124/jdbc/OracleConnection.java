package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleConnection {

	private static OracleConnection jdbc;
	
	// 외부에서의 인스턴스화를 막는다.
	private OracleConnection() {
	}

	// oracle 인스턴스를 얻는 방법은 getInstance() 메소드로 호출하는 방법뿐
	public static OracleConnection getInstance() {
		if(jdbc == null) {
			jdbc = new OracleConnection();
			
		}
		return jdbc;
	}
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection con = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","youngyoung","kty990122");
		return con;
	}
	
	public static void close(Connection con, Statement stmt, ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		close(con, stmt);
	}

	public static void close(Connection con, Statement stmt) {
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		close(con);
	}

	public static void close(Connection con) {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
