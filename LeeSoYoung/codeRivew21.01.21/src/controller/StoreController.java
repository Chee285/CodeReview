package controller;

import service.StoreService;

public class StoreController {
	public static String newId = "";

	public static boolean join(String id, String pwd, String option, int balance) {

		if (option.equals("1")) {
			String newId = id + "U";
		} else if (option.equals("2")) {
			String newId = id + "M";
		} else {
			System.out.println("예외발생에 대한 처리 ");
		}
		boolean result = StoreService.join(newId, pwd, option, balance);
		return result;
	}

	public static boolean login(String id, String pwd, String option, int balance) {

		if (option.equals("1")) {
			String newId = id + "U";
		} else if (option.equals("2")) {
			String newId = id + "M";
		} else {
			System.out.println("예외발생에 대한 처리 ");
		}
		boolean result = StoreService.login(newId, pwd, option, balance);
		return result;
	}

	public static boolean product(String name) {
		boolean result = StoreService.product(name);
		return result;
	}
}