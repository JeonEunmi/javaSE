package com.test022;

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
		this.result(a);
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
		this.result(a);
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
		this.result(a);

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
		this.result(a);
	}

	// ������
	public void method5() {
		int[][] a = new int[5][5];
		int size = a.length;
		
		//�ʱ�ȭ �׼�
		int y = -1;
		int x = 0;
		int d = 1;
		int cnt = 0;

		while (size >= 0) {
			for (int i = 0; i < size; i++) {
				y = y + d;
				a[x][y] = ++cnt;
			}
			--size;
			for (int i = 0; i < size; i++) {
				x = x + d;
				a[x][y] = ++cnt;
			}
			d = -d;
		}

		this.result(a);
	}
	
	
	// ��� ���� �޼ҵ�
	private void result(int[][] a) {
		
		for (int[] b : a) {
			System.out.println(Arrays.toString(b));
		}
	}
}
