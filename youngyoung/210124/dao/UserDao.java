package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.OracleConnection;
import vo.Users;

public class UserDao {
	private static ArrayList<Users> users = new ArrayList<Users>();
	
	private OracleConnection orc = OracleConnection.getInstance();
	 
//	// 추가하기
//	public int singup(Users u) {
//		int check = check(u.getId());
//		if(check == 0) {
//			
//			users.add(u);
//			return 1;
//		}else {
//			return 0;
//		}
//	}
//	
//	// 아이디 중복확인
//	public int check(String id) {
//		for(Users u: users) {
//			if(u.getId().equals(id)) {
//				return 1;
//			}
//		}
//		return 0;
//	}
//	
//	public int login (Users u) {
//		for(Users u1 : users) {
//			if(u1.getId().equals(u.getId()) && u1.getPwd().equals(u.getPwd())) {
//				return 1;
//			}
//			
//		}
//		return 0;
//	}
	
	
	// JDBC를 활용해서 DB저장해보기

	
	public int singup(Users u) {
		Connection con = null;
		try {
			con = orc.getConnection();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PreparedStatement pstmt = null;
		String sql = "insert into users values(?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, u.getId());
			pstmt.setString(2, u.getPwd());
			pstmt.setString(3, u.getOption());
			int result = pstmt.executeUpdate();
			return result;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			orc.close(con,pstmt);
		}
		return 0;
		
	}
	
	public  Users login(Users u) {
		Connection con = null;
		ResultSet rs = null;
		try {
			con = orc.getConnection();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PreparedStatement pstmt = null;
		String sql = "select * from users where id = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, u.getId());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String option = rs.getString("options");
				return new Users(id,pwd,option);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			orc.close(con,pstmt,rs);
		}
		return null;
		
	}
}
