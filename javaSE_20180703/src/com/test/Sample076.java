package com.test;

import java.util.Arrays;

public class Sample076 {

	public static void main(String[] args) {

		// �迭 ��� Ž�� �� ����
		// �迭�� ������ ������ ä���, �ջ� ���� ����

		// �Է°���
		int[] num = new int[5];

		int sum = 0;
		double avg = 0.0;

		// ó������
		for (int i = 0; i < num.length; ++i) {
			num[i] = (int) (Math.random() * 101);
			sum += num[i];
		}
		
		avg = (double) sum / num.length;
		
		// ��ü ��� ���
		// ��� ���
		System.out.println(Arrays.toString(num));
		System.out.println(sum);
		System.out.println(avg);
	}

}
