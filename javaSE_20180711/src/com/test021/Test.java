package com.test021;

import java.util.Arrays;

public class Test {

	// ����
	public void method1() {
		int[][] a = new int[5][5];

		int n = 0;

		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; j < a[i].length; ++j) {
				a[i][j] = ++n;
			}
		}
		for (int[] b : a) {
			System.out.println(Arrays.toString(b));
		}

	}

	// ����
	public void method2() {
		int[][] a = new int[5][5];

		int n = 0;

		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; j < a[i].length; ++j) {
				a[j][i] = ++n;
			}
		}
		for (int[] b : a) {
			System.out.println(Arrays.toString(b));
		}
	}

	// ���� - �¿�
	public void method3() {
		int[][] a = new int[5][5];

		// �ʱ�ȭ �׼�
		int n = 0;
		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; j < a[i].length; ++j) {
				a[i][(i % 2 == 0) ? j : a[i].length - 1 - j] = ++n;
			}
		}

		// ���
		for (int[] b : a) {
			System.out.println(Arrays.toString(b));
		}
	}

	// ���� - �¿�
	public void method4() {
		int[][] a = new int[5][5];

		int n = 0;
		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; j < a[i].length; ++j) {
				a[(i % 2 == 0) ? j : a[i].length - 1 - j][i] = ++n;
			}
		}
		for (int[] b : a) {
			System.out.println(Arrays.toString(b));
		}
	}

	// ������
	public void method5() {
		int[][] a = new int[5][5];

		int num = 1;
		int b = 1;
		int i = 0;
		int j = -1;
		int count = a.length;

		for (int m = 0; m < a.length; m++) {
			for (int n = 0; n < count; n++) {
				j = j + b;
				a[i][j] = num++;
			}
			count--;

			for (int n = 0; n < count; n++) {
				i = i + b;
				a[i][j] = num++;
			}

			b = b * -1;
		}

		for (int[] m : a) {
			System.out.println(Arrays.toString(m));
		}
	}
}
