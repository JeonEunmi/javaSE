package com.test;

import java.util.Arrays;

public class Sample115 {

	public static void main(String[] args) {
		
		//����)
		//2���� �迭 �ʱ�ȭ
		//2���� �迭(n * n)�� ��Ҹ� Ư�� ���ڷ� ä���.
		//���� ���, ������, (Ȧ��)������
		/* 
		���࿹)
		[1, 2, 3, 4, 5]
		[16, 17, 18, 19, 6]
		[15, 24, 25, 20, 7]
		[14, 23, 22, 21, 8]
		[13, 12, 11, 10, 9]
		*/
		
		//�迭 ����
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
		
		//���
		for (int[] b : a) {
			System.out.println(Arrays.toString(b));
		}
		
	}

}
