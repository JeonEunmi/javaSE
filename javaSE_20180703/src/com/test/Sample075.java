package com.test;

import java.util.Arrays;

public class Sample075 {

	public static void main(String[] args) {
		// ũ�� 5�� �迭�� �غ��ϰ� ���� ����(1~45)�� ä���.
		// �迭�� ä���� ���ڵ� �߿��� ���� ū �� ���

		int[] num = new int[5];

		for (int i = 0; i < num.length; ++i) {
			num[i] = (int) (Math.random() * 45) + 1;
		}

		int tmp = num[0];

		for (int i = 0; i < num.length -1 ; ++i) {
			if (tmp < num[i+1]) {
				tmp = num[i+1];
			}
		}

		System.out.println("���� ū ����? : "+tmp);
		System.out.println(Arrays.toString(num));
	}

}
