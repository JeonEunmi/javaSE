package com.test020;

import java.util.*;

//���θ޴� � Ŭ����
public class Main {

	public static void main(String[] args) {
		
		// ���� �޴� ����
		// 1. ���� ��ȯ  2. ���� 
		// 1�� �޴� ���ý� ����޴� ���
		// 1. 2���� -> 10����   2. 10���� -> 2����   3.����
		
		Scanner sc = new Scanner(System.in);
		SubMain sub = new SubMain();

		while(true) {
			System.out.println("=============================");
			System.out.println("  1. ������ȯ     2. ����   ");
			System.out.println("=============================");
			System.out.print("���� > ");
			
			int selectNo = sc.nextInt();
			sc.nextLine();
			
			if(selectNo == 2) break;
			
			if(selectNo == 1) {
				//�׼� �ڵ� -> �������� Ŭ������ �������� �޼ҵ�� ǥ��
				//���� �޴� Ŭ������ Ư�� �޼ҵ� ȣ��(calling)
				sub.method1(sc);
			}	
			
		}
		sc.close();
		System.out.println("���α׷� ����");	
		
	}

}
