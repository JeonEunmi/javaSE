package com.test;

public class Sample105 {

	public static void main(String[] args) {
		
		// �迭, �÷��� -> ���� for�� 
		// �ε����� �ʿ�� ���� �ʰ� �����͸� �������� ���� �� ����Ѵ�.
		
		int[] a = { 30, 40, 20, 50, 10 };

		int sum = 0;

		for (int b = 0; b < a.length; ++b) {
			sum += a[b];
		}
		
		System.out.println(sum);

		int[] c = { 30, 40, 20, 50, 10 };

		int total = 0;

		for (int b : c) {
			total += b;
		}
		
		System.out.println(total);
		

		/*
		 * for(�ڷ��� ���� : �迭��ü) {
			
		}
		 */
	}

}
