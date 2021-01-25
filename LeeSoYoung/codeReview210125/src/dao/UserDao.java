package dao;

import java.util.ArrayList;

import vo.Users;

public class UserDao {
	// id,pwd,option 저장소
	ArrayList<Users> users = new ArrayList<Users>();

	public int join(String id, String pwd, String option) {
		Users user = new Users(id, pwd, option);

		try {
			users.add(user); // ArrayList에 id, pwd, option이저 장됨
			return 1; // 성공시 1 리턴

		} catch (Exception e) {

			e.printStackTrace();
			return 0; // 실패시 0 리턴
		}
	}

	public int idcheck(String id) {

		Users user = new Users(id);

		int result = 0;
		// id 체크 id가 있을경우 : 1 id가 없을 경우 : 0
		for (int i = 0; i < users.size(); i++) {
			if (id.equals(users.get(i).getId())) {
				result = 1;
				break;
			}
		}
		return result;

	}

	//
	public int login(String id, String pwd) {
		Users user = new Users(id, pwd);
		int result = 0;

		for (int i = 0; i < users.size(); i++) {
			if (id.equals(users.get(i).getId())) {
				if (pwd.equals(users.get(i).getPwd()))
					
					result = 1;
				return result;
			}
		}
		System.out.println(result);
		return result;
	}

	public int op(String id, String option) {
		int result = 0;
		// "U": 1, "M" :0 으로 반환
		Users user = new Users();
		for (int i = 0; i < users.size(); i++) {
			if (id.equals(users.get(i).getId())) {
				if (users.get(i).getOption().equals("U")) {
					result = 1;
				}
			}
		}return result;
	}
}