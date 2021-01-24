package controller;

import service.UserService;
import vo.Users;

public class UserController {
	private static UserService service = new UserService();

	public void singup(Users u) {

		 if(service.singup(u) ==1) {
			 System.out.println("회원가입성공하였습니다.");
		 }else {
			 System.out.println("회원가입 실패하였습니다.");
		 }
		
	}
//	public void login(Users u) {
//		 if(service.login(u) ==1) {
//			 System.out.println("로그인이 성공하였습니다.");
//			 
//		 }else {
//			 System.out.println("로그인 실패하였습니다.");
//		 }
//	}
	
	public void login(Users u) {
		Users resultU= service.login(u);
		if(resultU !=null) {
			System.out.println(resultU);
		}
	}
}
