package service;

import dao.UserDao;
import vo.Users;

public class UserService {
	private static UserDao dao= new UserDao();

	public int singup(Users u) {
		return dao.singup(u);
		
	}

//	public int login(Users u) {
//		return dao.login(u);
//		
//	}

	public Users login(Users u) {
		return dao.login(u);
		
	}
}
