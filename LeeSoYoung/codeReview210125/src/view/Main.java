package view;

import java.util.Scanner;

import controller.UserController;

public class Main {
	 static UserController uc =  new UserController();
	// 로그인 어플리케이션을 만들어보세요.
	// 사용자 입장에서 아디와 비밀번호를 입력해서 회원가입과 로그인을 합니다. (필수)
	// 추가적으로 user와 manager를 구분할수 있도록 Users클래스에 Option 매개변수를 활용해보세요. (선택)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run= true;
		
		
		while(run){
			System.out.println("---------------------");
			System.out.println("1. 회원가입 / 2. 로그인");
			System.out.println("---------------------");
			int num =  sc.nextInt();
			if(num==1) {
				System.out.println("id를 입력해주세요");
				String id = sc.next();
				System.out.println("비밀번호를 입력해주세요");
				String pwd = sc.next();
				System.out.println("사용자면 'U', 매니저 : 'M' 을 입력하여 주세요");
				String option=sc.next();
				uc.join(id,pwd,option);
			}
			else if(num==2) {
				System.out.println("id를 입력해주세요");
				String id1 = sc.next();
				System.out.println("비밀번호를 입력해주세요");
				String pwd1 = sc.next();
				uc.login(id1, pwd1);
			}	
		}
	}
	
}