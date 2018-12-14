package com.bankAccount.main;

import java.util.*;

import com.bankAccount.service.AdminSubMain;
import com.bankAccount.service.OwnerSubMain;
// ���� Ŭ����
public class Main {

	/*
	- ������ȸ, �����Ա�, ������� ��� ����
	- ������ ����������, ��������, �ŷ����� ���� ����
	- ������ ���������� �̸�, ��ȭ��ȣ�� ����
	- ���������� ���¹�ȣ, �����ܾ�, ���»�����, ��й�ȣ, �������ŷ��Ϸ� ����
	- �ŷ������� ���¹�ȣ, ����ݾ�, �������, ����ݱ���, �ܾ����� ����
	- ������ ���� ȭ�� ����. ����� ȭ�鿡�� �޴���ȣ�� �ƴ� Ư����ȣ �Է½� ������ ȭ������ �̵� ����. 
	- ������ ���� ȭ�鿡�� ���»���, ��ü������ȸ �� ����ݳ��� ��� ���
	- ����ȭ/������ȭ ��� ����
	*/
	
	// ���� �޴� ����
	// 1.������ȸ 2.�����Ա� 3.������� 4.����
	// -> ������������ 99���� ������� �ʴ´�.
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		AdminSubMain admin = new AdminSubMain();
		
		OwnerSubMain owner = new OwnerSubMain();
		
		
		while(true) {
			
			System.out.println("**���°��� v1.0**");
			System.out.println("1.������ȸ 2.�����Ա� 3.������� 0.����");
			System.out.print("����> ");
			
			int selectNum = sc.nextInt();
			sc.nextLine();
			
			if(selectNum == 0) {
				break;
			}
			
			switch(selectNum) {
			
			case 1 : 
				owner.accountSearch();
				break;
			case 2 :
				owner.accountIn();
				break;
			case 3 :
				owner.accountOut();
				break;
			case 99 :
				admin.adminsub();
				break;
			default : 
				break;
			}
			
			
		}
		
		sc.close();
		System.out.println("���α׷� ����");
	}

}
