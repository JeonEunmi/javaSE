package com.test;

import java.util.Arrays;

public class Sample074 {

	public static void main(String[] args) {

		// �迭 ���� �� �ʱ�ȭ
		// ���� ���, 1���� 5������ ���� �迭�� ����

		// �ε��� ���� ����
		int[] a = new int[5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		System.out.println(Arrays.toString(a));   // [1, 2, 3, 4, 5]

		// �ݺ��� �̿��ؼ� ����
		for (int i = 0; i < a.length; ++i) {
			a[i] = i + 11;

		}
		System.out.println(Arrays.toString(a));  // [11, 12, 13, 14, 15]
		
		
		// ���� �� �ʱ�ȭ ���ÿ�  -> �� ��Ͽ� ���� �迭 ����
		int[] b = {21, 22, 23, 24, 25};
		System.out.println(Arrays.toString(b));  //[21, 22, 23, 24, 25]
	}

}
