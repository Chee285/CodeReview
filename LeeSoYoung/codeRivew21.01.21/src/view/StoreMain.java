package view;

import java.util.Scanner;

import controller.StoreController;

public class StoreMain {
	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------");
			System.out.println(" 1. 로그인   2. 회원가입");
			System.out.println("-------------------------------");

			int num = sc.nextInt();

			try {
				if (num == 1) {
					System.out.print("id를 입력하여 주십시오");
					String id = sc.next();
					System.out.println();
					System.out.print("비밀번호를 입력하여 주십시오");
					String pwd = sc.next();
					System.out.println();
					System.out.print("USER: 1 MANAGER: 2");
					String option = sc.next();
					int balance = 0;
					boolean result = StoreController.login(id, pwd, option, balance);
					if (result) {
						System.out.println("로그인성공");

						while (true) {
							// 로그인 한 유저만 사용 가능합니다.
							System.out.println("-------------------------------");
							System.out.println(" 1. 물건 결제하기  2.충전하기");
							System.out.println("-------------------------------");
							if (option.equals("1")) {
								System.out.println("1.물건 결제하기");
								System.out.println("물건 이름을 입력해주세요");
								String name = sc.next();
								System.out.println();

								boolean result1 = StoreController.product(name);
								if(result){
									System.out.println("물건이름 : "+ name);
								}else{
									System.out.println("잘못입력하였습니다.");						
								}
								
							} else if (option.equals("2")) {
								System.out.println("2.충전하기");
								System.out.println("충전할 금액을 입력해주세요");
								int price = sc.nextInt();
								boolean result = StoreService();
								
							} else {
								System.out.println("잘못입력하셨습니다.");
							}
						}

					} else {
						System.out.println("로그인실패");
					}

				} else if (num == 2) {
					System.out.print("id를 입력하여 주십시오");
					String id = sc.next();
					System.out.println();
					System.out.print("비밀번호를 입력하여 주십시오");
					String pwd = sc.next();
					System.out.println();
					System.out.print("USER: 1 MANAGER: 2");
					String option = sc.next();
					int balance = 0;

					boolean join = StoreController.join(id, pwd, option, balance);

					if (join == true) {
						System.out.println("id : " + id + "회원가입되었습니다.");
					} else {
						System.out.println("다시 회원가입을 해주십시오");

					}
				}

				//
				// System.out.println("물건 결제하기, 출전하기");
				//
				// // manager만 가능한 조작입니다.
				// System.out.println("판매 물품 등록하기 / 판매 물품 리스트보기");

			} catch (StackOverflowError e) {

			}

		}
	}
}
