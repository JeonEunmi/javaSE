package com.test;

public class Sample050 {
	public static void main(String[] args) {
		
		// ��ø for��
		/*
		 * for(initialization; Boolean_expression; update) {
   			// Statements
   			for(initialization; Boolean_expression; update) {
   				// Statements
				}
			}
		 */
		
		// ��ø for���� �ٱ��� for���� ������ ���� for���� ���� �̸��� �ٸ��� �����Ѵ�.
		
		// ������ ������ 10�� �ݺ�
		// 1���� 10������ ���� ���
		for (int a = 1; a <= 10; ++a) {
			for (int b = 1; b <= 10; ++b) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
		
		
		
		for (int a = 1; a <= 10; ++a) {
			// Ư�������� 10������ ���� ���
			for (int b = a; b <= 10; ++b) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}
}
