package com.test022;

import java.util.Arrays;

public class Test {

	// 수평
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

	// 수직
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

	// 수평 - 좌우
	public void method3() {
		int[][] a = new int[5][5];

		// 초기화 액션
		int n = 0;
		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; j < a[i].length; ++j) {
				a[i][(i % 2 == 0) ? j : a[i].length - 1 - j] = ++n;
			}
		}
		this.result(a);

	}

	// 수직 - 좌우
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

	// 달팽이
	public void method5() {
		int[][] a = new int[5][5];
		int size = a.length;
		
		//초기화 액션
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
	
	
	// 출력 전용 메소드
	private void result(int[][] a) {
		
		for (int[] b : a) {
			System.out.println(Arrays.toString(b));
		}
	}
}
