package view;

import java.util.Scanner;

import controller.UserController;
import vo.Users;

public class Main {
	private static Scanner sc = new Scanner(System.in);
	private static Users format(){
		System.out.print("아이디를 입력하세요.");
		String id = sc.next();
		System.out.print("비밀번호를 입력하세요.");
		String pwd = sc.next();
		System.out.print("1.User / 2.Manager");
		String option = sc.next();
		if (option.equals("1")) {
			option = "User";
		} else if (option.equals("2")) {
			option = "Manger";
		} else {
			System.out.println("1번과 2번으로만 입력해주세요.");
			return null;
		}
		
		Users u = new Users(id,pwd,option);
		return u;
		}
	private static UserController controller = new UserController();

	// 로그인 어플리케이션을 만들어보세요.
	// 사용자 입장에서 아디와 비밀번호를 입력해서 회원가입과 로그인을 합니다. (필수)
	// 추가적으로 user와 manager를 구분할수 있도록 Users클래스에 Option 매개변수를 활용해보세요. (선택)
	public static void main(String[] args) {
		
		boolean cycle = true;
		while (cycle) {

			System.out.println("1. 회원가입 / 2. 로그인");
			String menu = sc.next();
			
			if (menu.equals("1")) {
				Users u = format();
				if(u!=null) {
					controller.singup(u);	
				}
				
				
			}else if(menu.equals("2")) {
				Users u = format();
				if(u!=null) {
					controller.login(u);	
				}
				
			}
//			switch (menu) {
//			
//			// 회원가입
//			case "1":
//				
//				controller.singup(id, pwd, option);
//				break;
//				
//			// 로그인
//			case "2":
//				
//				controller.login(id,  pwd, option);
//				break;
//
//			case "3":
//				System.out.println("시스템을 종료합니다.");
//				cycle = false;
//				break;
//
//			default:
//				System.out.println("1번 2번외에 메뉴는 존재하지 않습니다.");
//				break;
//			}
		}
	}

}
