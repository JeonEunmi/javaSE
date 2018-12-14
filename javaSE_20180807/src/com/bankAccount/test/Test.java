package com.bankAccount.test;

import java.util.ArrayList;
import java.util.List;

import com.bankAccount.domain.AccountHistory;
import com.bankAccount.domain.AccountList;
import com.bankAccount.persistance.AccountDAO;

// �׼� �׽�Ʈ�� Ŭ����
public class Test {

	public static void main(String[] args) {
		
		AccountDAO dao = new AccountDAO();
		
		List<AccountList> list = new ArrayList<AccountList>(dao.accountAllSearch());
		
		List<AccountList> list2 = new ArrayList<AccountList>(dao.accountIDSearch("2018030101"));
		
		List<AccountList> list3 = new ArrayList<AccountList>(dao.accountPersonalSearch("�ڱ浿", "010-5678-1234"));
		
		List<AccountHistory> his = new ArrayList<AccountHistory>(dao.accountIOPrint("2018030101", "20171212"));
		
		
		// ������ȸ �޼ҵ� �׽�Ʈ
		// -> ��ü
		/*
		��ü���� ���
		--------------------------------------------         
		���¹�ȣ / �ܾ� / ���»����� / �������ŷ��� / ������ / ��ȭ��ȣ
		2017101001 / 200000 / 20171010 / 20180101 / �ڱ浿 / 010-5678-1234
		�� 1��
		*/

		System.out.println("��ü���� ���");
		System.out.println("--------------------------------------------");
		System.out.println("���¹�ȣ / �ܾ� / ���»����� / �������ŷ��� / ������ / ��ȭ��ȣ");
		for(AccountList a : list) {
			System.out.println(a);
		}
		System.out.printf("�� %d �� %n", list.size());
		
		
		
		System.out.println();		
		System.out.println("(2018030101) ���� ���");
		System.out.println("--------------------------------------------");
		System.out.println("���¹�ȣ / �ܾ� / ���»����� / �������ŷ��� / ������ / ��ȭ��ȣ");
		for(AccountList a : list2) {
			System.out.println(a);
		}
		System.out.printf("�� %d �� %n", list2.size());
		
		
		System.out.println();		
		System.out.println("(�ڱ浿, 010-5678-1234) ���� ���");
		System.out.println("--------------------------------------------");
		System.out.println("���¹�ȣ / �ܾ� / ���»����� / �������ŷ��� / ������ / ��ȭ��ȣ");
		for(AccountList a : list3) {
			System.out.println(a);
		}
		System.out.printf("�� %d �� %n", list3.size());
		
		
		
		
		System.out.println();
		System.out.println("��������ݳ��� ��� �޼ҵ� �׽�Ʈ");
		// ��������ݳ��� ��� �޼ҵ� �׽�Ʈ
		/*
		���¹�ȣ>2018030101
		������½�����>20171010
		(2018030101)���� ��������ݳ���
		--------------------------------------------
		���¹�ȣ / �ݾ� / ������� / ���� / �ܾ� 
		2018030101 / 100000 / 20171010 / �Ա� / 100000
		2018030101 / 100000 / 20180301 / �Ա� / 200000
		�� 2��
		*/
		
		System.out.println("���¹�ȣ > 2018030101");
		System.out.println("���� ��½����� > 20171015");
		System.out.println("--------------------------------------------");
		System.out.println("���¹�ȣ / �ݾ� / ������� / ���� / �ܾ�");
		for(AccountHistory h : his) {
			System.out.println(h);
		}
	
	}
}
