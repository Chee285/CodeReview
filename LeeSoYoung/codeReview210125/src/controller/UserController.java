package controller;

import service.UserService;

public class UserController {

	UserService us = new UserService();

	public int join(String id, String pwd, String option) {
		int result = 0;

		result = us.idcheck(id);

		// id가 없는경우: 0 id가 있는경우: 1
		if (result == 0) {
			System.out.println("회원가입 진행");
			int joinresult = us.join(id, pwd, option);
			if (joinresult == 1) {
				System.out.println("id" + id + " 회원가입 성공!");
			} else {
				System.out.println("회원가입 실패");
			}
		} else {
			System.out.println("사용자 id가 이미 생성되었습니다.");
		}
		return result;
	}

	public int login(String id, String pwd) {
		String option = "U";
		int result = us.login(id, pwd);

		int opc = us.op(id, option); // "U": 1, "M" :0 으로 반환

		if (id != null && id != "") {
			if (pwd != "" && pwd != null) {

				if (opc == 1) {
					System.out.println(id + "user 로그인 성공");
					return result;
				} else if (opc == 0) {
					System.out.println(id + "매니저 로그인 성공");
					return result;
				} else {
					System.out.println("로그인 오류");
				}
			}
		}else {
			System.out.println("아이디가 없습니다.");
		} return (Integer) null;
	}
}