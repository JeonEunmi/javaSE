package com.test;

public class Sample051 {

	public static void main(String[] args) {

		// ������ ��ü(1��~9��)�� ����ϴ� ��ø for��
		// 1�� -> 1 * 1 ~ 1 * 9
		// ...
		// 9�� -> 1 * 1 ~ 9 * 9
		
		// ������ i���� ������ ���
		/*
		int j = (int)(Math.random() * 9 ) + 1;
		for(int i = 1; i < 10; ++i) {
			System.out.println(j + " * " + i + " = " + (j * i));
		}
		*/
		
		
		for(int a = 1; a < 10; ++a) {
			for(int b = 1; b < 10; ++b) {
				System.out.println(a + " * " + b + " = " + (a * b));
			}
			System.out.println();
		}

	}

}
