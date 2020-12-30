package com.my.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.my.dao.CustomerDAO;
import com.my.dao.CustomerDAOList;
import com.my.exception.FindException;
import com.my.vo.Customer;

public class CustomerMain {
	private static CustomerDAO dao = new CustomerDAOList();
	static List<Customer> customers = new ArrayList<Customer>();
	private static void selectAll() {
		
		try {
			customers = dao.selectAll();
			for(int i=0; i<customers.size(); i++) {
				Customer c = customers.get(i);
				System.out.println(c.getId()+", "+c.getId()+", "+c.getPwd()+", "+c.getName());
			}
		} catch (FindException e) {
			// ã�� ���Ͽ������ ���ܻ�Ȳ�� �߻��Ѵ�. �׻�Ȳ�� ���⼭ �����ش�.
			System.out.println(e.getMessage());
		}
		
	}
	
	private static void selectAll1() {
		String result = dao.selectAll1();
		System.out.println(result);
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		System.out.println("1. ��ü��ȸ ( try~catch ) 2. ��ü��ȸ (if)");
		int menu = sc.nextInt();
		
		if(menu== 1) {
			// ��ü ��ȸ
			selectAll();
		}else if(menu ==2) {
			// �� �߰�
			selectAll1();
		}else {
			// ������
		}
	}

	

	
}
