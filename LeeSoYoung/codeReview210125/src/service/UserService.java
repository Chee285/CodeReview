package service;

import dao.UserDao;

public class UserService {
	UserDao ud = new UserDao();
	
	public int join(String id, String pwd,String option) {
		int result = ud.join(id,pwd,option);
		return result;
	}
	public int idcheck(String id) {
		int result = ud.idcheck(id);
			return result;		
	}
	public int login(String id, String pwd ) {
		int result = ud.login(id,pwd);
		return result;
	}
	public int op(String id,String option) {
		int result = ud.op(id,option);
		return result;
	}
	
}