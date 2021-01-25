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
//				System.out.println("id : " + id + " 회원가입 성공!");
			} else {
				System.out.println("회원가입 실패");
			}
		} else {
			System.out.println("사용자 id가 이미 생성되었습니다.");
		}
		return result;
	}
//--------------------------------------------------------------------
	/*
	 * 해당 메소드에 문제가 발생하였습니다.
	 * 회원가입을 하지 않았는데 로그인 되었던 문제점이 발생하였습니다.
	 * 그 다른 아키텍처는 문제가 없었지만 문제가 발생한거는
	 * us.login(id,pwd) 해당 메소드를 사용하고 int result를 사용하지 않았기 때문입니다.
	 * 
	 */
	public void login(String id, String pwd) {
		String option = "U";
		int result = us.login(id, pwd); // 유저아이디와 비밀번호 확인

		 // "U": 1, "M" :0 으로 반환
		if (result == 1) {
			int opc = us.op(id, option);
			if (id != null && id != "") {

				if (pwd != "" && pwd != null) {

					if (opc == 1) {
						System.out.println(id + "user 로그인 성공");
						
					} else if (opc == 0) {
						System.out.println(id + "매니저 로그인 성공");
					
					} else {
						System.out.println("로그인 오류");
					}
				}
			} else {
				System.out.println("아이디가 없습니다.");
			}
		
		}else {
			System.out.println("해당아이디는 존재 하지 않습니다.");
			
		}
	}
}