package dao;

import java.util.ArrayList;

import vo.Stuff;
import vo.User;

public class StoreDAO {

	// 회원 목록을 가지고 있는 ArryaList입니다.
	private static ArrayList<User> users = new ArrayList<User>();

	// 물건 목록을 가지고 있는 ArrayList입니다.
	private static ArrayList<Stuff> stuffs;

	public static boolean join(String id, String pwd, String option, int balance) {
		User user = new User(id, pwd, option, balance);
		boolean result = users.add(user);
		return result;
	}

	public static boolean login(String id, String pwd, String option, int balance) {
		//boolean 초기값 false
		boolean result = false;

		//id값 pwd값 확인
		if(result==false){
			System.out.println("로그인 dao");
		for (int i = 0; i < users.size(); i++) {
			if (id.equals(users.get(i).getId()) && pwd.equals(users.get(i).getPwd())) {
				result = true;
			} else {
				result = false;
			}
		}}
		return result;
		
	}
	public static boolean product(String product){
		Stuff stuff = new Stuff(product);
		boolean result = stuffs.add(stuff);
		return result;
		
		
	}
}