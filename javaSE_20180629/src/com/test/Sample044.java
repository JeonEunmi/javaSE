package com.test;

public class Sample044 {

	public static void main(String[] args) {
		// 1���� 100������ ���� �ջ��ϰ� �� ����� ���
		
		/*
		 * ���࿹)
		 * 1 + 2 + 3 + ... + 100 = 5050
		 */
		
		
		int result = 0;
		
		for(int i=1; i<=100; ++i) {
			if(i < 100) {
				System.out.print(i + " + ");
			} else
				System.out.print(i + " = ");
			result += i;
		}
		System.out.println(result);
	}

}
