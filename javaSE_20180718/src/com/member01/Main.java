package com.member01;

import java.util.*;

// ���θ޴� � Ŭ���� ����
public class Main {
	
	// main() �޼ҵ常 ����
	public static void main(String[] args) {
		// ȸ������ v1.0 (�ܼ� ����)
		/* �Է�, ���, ����, �˻�, ���� -> 5�� ��� �ϸ� ����!
		 * 1.0 �䱸�м� - ȸ�� ���� �Է�, ȸ�� ���� ��ü ���
		 * 1.1 ȸ�� ���� �˻�(�̸�, ��ȭ��ȣ, �̸���, ��Ͽ�(yyyy-MM) ���� ����, ����޴� �) - �̸�, ��ȭ��ȣ, �̸���, �����(yyyy-MM-dd)
		 * ȸ����ȣ('M01' ���� - ������ȣ�̹Ƿ� �ߺ�x) 1.ȸ�������Է�  2.ȸ���������  3.ȸ�������˻� 4.����
		 */
		
		Scanner sc = new Scanner(System.in);
		SubMain sub = new SubMain();
		boolean flag = true;
		
		System.out.println("**ȸ������ �ý���**");
		
		//���� �޴� ����
		while(flag) {
			System.out.println("1. ȸ�������Է� | 2.ȸ����ȣ��� | 3. ����");
			System.out.print("���� > ");
			
			int selectNum = sc.nextInt();
			sc.nextLine();
			
			switch(selectNum) {
				
			case 1 :
				sub.join(sc);
				break;
			
			case 2 :
				sub.memberOutput();
				break;
			
			case 3 :
				flag = false;
				break;
			}
			
		}

		
		sc.close();
		System.out.println("���α׷� ����");
	}

}
