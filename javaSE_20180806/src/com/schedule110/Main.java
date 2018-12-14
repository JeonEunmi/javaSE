package com.schedule110;

import java.util.Scanner;

// ���� �޴� � Ŭ���� ����
public class Main {

	public static void main(String[] args) {
		// ���� ���� v1.4 (�ܼ� ����)
		/*
		1. �䱸�м�
		- ���� �Է�, ���� ��� �� �˻�(���� ����, Ư�� �� ����, Ư�� �� ����, Ư�� �ܾ� ����, ��ü)
		- ���� ��½� �͸� ���� ��ü�� �̿��� ���� ��� ����
		- Ŭ���� 4��(Schedule, ScheduleList, SubMain, Main) ���
		- List �÷��� ����� ���
		- ���� ���� ��� �߰�
		- ����ȭ, ������ȭ ��� �߰�
 		*/
		SubMain sub = new SubMain();

		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		int selectNum = 0;
		
		System.out.println("** ���� ���� v1.4 **");
		
		while(flag) {
		System.out.println("==================================================================");
		System.out.println("1. ���� �Է�  |  2. ���� ��� �� �˻�  |  3. ��������  |  4. ����");
		System.out.println("==================================================================");
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
			sub.scheduleRemove(sc);
			break;
			
		case 4 :
			// ����ȭ �޼ҵ� ȣ�� �߰�
			sub.serializable();
			flag = false;
		}
		
		}

		sc.close();
		System.out.println("���α׷� ����");
	}

}
