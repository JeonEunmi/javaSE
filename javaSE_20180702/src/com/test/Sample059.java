package com.test;

import java.util.Scanner;

public class Sample059 {

	public static void main(String[] args) {
		// �ܺ�(Ű����) �Է�
		// ->java.util ��Ű���� Scanner Ŭ����
		
		// Ư�� ���ڿ��� �Է�(���� ���, quit) �� ������ ���� ����
		
		Scanner sc = new Scanner(System.in);
		
		String s;
		while(true) {
			// �Է¹��� ���ڿ� ���
			System.out.println("���Ḧ ���Ͻø� quit�� �Է����ּ���. >");
			// ���ڿ��� ���� �ܺ� �Է�
			s = sc.nextLine();
			// �Է� ���� ���ڿ��� "quit" �� ��� �ݺ��� ����	
			
			if(s.equals("quit")) {
				break;
			}
		}
		
		sc.close();
		
	}
}
