package com.schedule01;

import java.util.*;

// ���� �޴� � Ŭ���� ����
public class Main {

	public static void main(String[] args) {
		// ���� ���� v1.1 (�ܼ� ����)
		//
		// 1. �䱸�м�
		// - ���� �Է�, ���� ��� �� �˻�(���� ����, Ư�� �� ����, Ư�� �� ����, Ư�� �ܾ� ����, ��ü)
		// - ������ ��¥ �� �����ϱ�  -> ����! (�˻����, ��ü��� ���. ���� ��¥�� ���� �������)

		SubMain sub = new SubMain();

		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		int selectNum = 0;
		
		System.out.println("** ���� ���� v1.0 **");
		
		while(flag) {
		System.out.println("======================================================");
		System.out.println("1. ���� �Է�  |  2. ���� ��� �� �˻�  |  3. ����");
		System.out.println("======================================================");
		System.out.print("���� > ");
		selectNum = sc.nextInt();
		sc.nextLine();
		
		switch(selectNum) {
		
		case 1 : 
			sub.scheduleAdd(sc);
			break;
		
		case 2 :
			sub.scheduleSearch(sc);
			break;
			
		case 3 :
			flag = false;
		}
		
		}
		
		sc.close();
		System.out.println("���α׷� ����");
	}

}
