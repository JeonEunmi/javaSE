package com.test;

import java.util.*;

public class Sample060 {

	public static void main(String[] args) {
		
		// �ܺ�(Ű����) �Է��� �̿��� ���� ���� ���ø����̼� �ۼ�
		// 1. ����   2. ���   3. �ܰ�   4. ����
		
		boolean run = true;
		
		// ���ݾ� ��� ���� �ӽ� ����
		int bank = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("---------------------------------");
			System.out.print("����> ");
			int m = scanner.nextInt();
			scanner.nextLine();
			if (m == 1) {
				System.out.print("���ݾ�> ");
				int m2 = scanner.nextInt();
				scanner.nextLine();
				bank += m2;		
			} 
			
			if (m == 2) {
				System.out.print("��ݾ�> ");
				int m2 = scanner.nextInt();
				scanner.nextLine();
				bank -= m2;
			}
			
			if (m == 3) {
				System.out.println("�ܰ�> " + bank);
			}
			
			if (m == 4) {
				break;
			}

		}
		
		scanner.close();
		System.out.println("���α׷� ����");
	}
}


