package com.test;

import java.util.Arrays;

public class Sample109 {

	public static void main(String[] args) {

		// 1���� �迭 -> 2���� �迭
		// 2���� �迭 -> 1���� �迭

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
//		int[][] b = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 } };
		
//		int[][] c = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10 } };
		
		int[] t1 = Arrays.copyOfRange(a, 0, 5);
		int[] t2 = Arrays.copyOfRange(a, 5, 10);
		
		int[][] b = new int[2][];
		b[0] = t1;
		b[1] = t2;
		
		int count = 3;   // ������ �������� �ϴ� ��, ���� ~���� ������ �Ұž�! 
		int tmp = a.length / count;  //����̴� �����迭���� count��ŭ ���������� �� ���� ���ϴ� ��
		int[][] c = new int[tmp][];   //tmp���� ���� ���� �迭 c�� ����
		
		for(int i=0; i<c.length; ++i) {
			c[i] = Arrays.copyOfRange(a, i*count, i*count+count);   //count��ŭ ��� �迭 ����
		}
		
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(b[0]));
		System.out.println(Arrays.toString(b[1]));
		
		for(int i=0; i<c.length; ++i) {
			System.out.println(Arrays.toString(c[i]));   //�������迭 c�� ���
		}
	}
}
