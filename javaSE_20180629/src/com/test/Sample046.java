package com.test;

public class Sample046 {
	public static void main(String[] args) {
		
		// while, break ����
		// 2���� �ֻ��� ������
		// -> 2���� �ֻ����� ���� Ư����(25)�� �� �� ���� �ݺ� ó�� 
		/*
		 * ���࿹)
		 * 1ȸ : (5, 6)
		 * 2ȸ : (2, 3)
		 * ...
		 * nȸ : (5, 5)    -> ���� 25�� �� ��
		 * -------------- ���α׷�����
		 */
		
		int i = 1;
		
		while(true) {
			
			int a = (int)(Math.random()*6)+1;
			int b = (int)(Math.random()*6)+1;
			
			int multiply = a*b;
			
			System.out.println(i+"ȸ : (" + a + ", " + b + ")");
			++i;
			if(multiply == 25)
				break;
		}
		System.out.println("-------------- ���α׷�����");
	}
}
