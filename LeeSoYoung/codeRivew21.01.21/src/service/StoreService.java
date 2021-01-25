  
package service;

import dao.StoreDAO;

public class StoreService {
	
	public static boolean join(String id, String pwd, String option,int balance){
		boolean resutl = StoreDAO.join(id,pwd,option,balance);
		return resutl;
	}
	
	public static boolean login(String id, String pwd, String option,int balance){
		
		if( id == null){
		boolean result = StoreService.login(id,pwd,option,balance);
		return result;
		}return false;
	}
	public static boolean product(String name){
		boolean result =StoreDAO.product(name);
		return result;
	}
}